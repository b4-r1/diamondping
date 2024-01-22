package bari.diamondping.event;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.world.*;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import org.jetbrains.annotations.Nullable;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BlockBreakHandler implements PlayerBlockBreakEvents.After {
    @Override
    public void afterBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        //player.sendMessage(Text.literal(String.valueOf(pos)));world.getBlockState(blockPos)
        //player.sendMessage(Text.literal(String.valueOf(world.getBlockState(pos.add(1,0,0)))));
        String blockString1 = String.valueOf(world.getBlockState(pos.add(1,0,0)));
        String blockString2 = String.valueOf(world.getBlockState(pos.add(-1,0,0)));
        String blockString3 = String.valueOf(world.getBlockState(pos.add(0,1,0)));
        String blockString4 = String.valueOf(world.getBlockState(pos.add(0,-1,0)));
        String blockString5 = String.valueOf(world.getBlockState(pos.add(0,0,1)));
        String blockString6 = String.valueOf(world.getBlockState(pos.add(0,0,-1)));
        if ((((blockString1.substring(16).equals("diamond_ore}")) || (blockString2.substring(16).equals("diamond_ore}"))) || ((blockString3.substring(16).equals("diamond_ore}")) || (blockString4.substring(16).equals("diamond_ore}")))) || ((blockString5.substring(16).equals("diamond_ore}")) || (blockString6.substring(16).equals("diamond_ore}")))) {
            for (int i = 0; i<5; i++){
            world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.BLOCKS,5,2);
            world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.BLOCKS,5,Float.parseFloat(Double.toString(1.5)));
            world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.BLOCKS,5,1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
}
        }
    }
}
