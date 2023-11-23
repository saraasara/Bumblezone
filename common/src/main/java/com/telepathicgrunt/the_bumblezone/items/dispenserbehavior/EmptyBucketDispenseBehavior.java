package com.telepathicgrunt.the_bumblezone.items.dispenserbehavior;

import com.telepathicgrunt.the_bumblezone.mixin.blocks.DefaultDispenseItemBehaviorInvoker;
import com.telepathicgrunt.the_bumblezone.modinit.BzFluids;
import com.telepathicgrunt.the_bumblezone.modinit.BzItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.DispenserBlockEntity;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;


public class EmptyBucketDispenseBehavior extends DefaultDispenseItemBehavior {
    public static DispenseItemBehavior DEFAULT_EMPTY_BUCKET_DISPENSE_BEHAVIOR;
    public static final DefaultDispenseItemBehavior DROP_ITEM_BEHAVIOR = new DefaultDispenseItemBehavior();

    /**
     * Dispense the specified stack, play the dispense sound and spawn particles.
     */
    @Override
    public ItemStack execute(BlockSource source, ItemStack stack) {
        Level world = source.level();
        Position dispensePosition = DispenserBlock.getDispensePosition(source);
        BlockPos dispenseBlockPos = BlockPos.containing(dispensePosition);
        BlockState blockstate = world.getBlockState(dispenseBlockPos);

        if (blockstate.getBlock() == BzFluids.HONEY_FLUID_BLOCK.get() && blockstate.getFluidState().isSource()) {
            world.setBlockAndUpdate(dispenseBlockPos, Blocks.AIR.defaultBlockState());
            stack.shrink(1);
            if (!stack.isEmpty())
                addItemToDispenser(source, BzItems.HONEY_BUCKET.get());
            else
                stack = new ItemStack(BzItems.HONEY_BUCKET.get());
        }
        else {
            // If it instanceof DefaultDispenseItemBehavior, call dispenseStack directly to avoid
            // playing particles and sound twice due to dispense method having that by default.
            if(DEFAULT_EMPTY_BUCKET_DISPENSE_BEHAVIOR instanceof DefaultDispenseItemBehavior) {
                return ((DefaultDispenseItemBehaviorInvoker)DEFAULT_EMPTY_BUCKET_DISPENSE_BEHAVIOR).invokeExecute(source, stack);
            }
            else {
                // Fallback to dispense as someone chose to make a custom class without dispenseStack.
                return DEFAULT_EMPTY_BUCKET_DISPENSE_BEHAVIOR.dispense(source, stack);
            }
        }

        return stack;
    }


    /**
     * Play the dispense sound from the specified block.
     */
    @Override
    protected void playSound(BlockSource source) {
        source.level().levelEvent(1002, source.pos(), 0);
    }


    /**
     * Adds honey bottle to dispenser or if no room, dispense it
     */
    private static void addItemToDispenser(BlockSource source, Item newItem) {
        if (source.blockEntity() instanceof DispenserBlockEntity) {
			DispenserBlockEntity dispenser = source.blockEntity();
            ItemStack honeyBottle = new ItemStack(newItem);
            if (!HopperBlockEntity.addItem(null, dispenser, honeyBottle, null).isEmpty()) {
                DROP_ITEM_BEHAVIOR.dispense(source, honeyBottle);
            }
        }
    }
}
