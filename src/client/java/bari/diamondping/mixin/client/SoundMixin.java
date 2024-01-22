package bari.diamondping.mixin.client;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(WorldRenderer.class)
public class SoundMixin {
	@Shadow
	private ClientWorld world;

	@Inject(at = @At("TAIL"), method = "processWorldEvent")
	private void stupidfuckignmixin(int eventId, BlockPos pos, int data, CallbackInfo ci) {
		if (eventId == 2001) {
			String bigstring = String.valueOf(world.getBlockState(pos.add(1, 0, 0))) + String.valueOf(world.getBlockState(pos.add(-1, 0, 0))) + String.valueOf(world.getBlockState(pos.add(0, 1, 0))) + String.valueOf(world.getBlockState(pos.add(0, -1, 0))) + String.valueOf(world.getBlockState(pos.add(0, 0, 1))) + String.valueOf(world.getBlockState(pos.add(0, 0, -1)))+String.valueOf(world.getBlockState(pos));
			if (bigstring.contains("diamond_ore}")) {
				world.playSoundAtBlockCenter(pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.MASTER, 1, 2,false);
				world.playSoundAtBlockCenter(pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.MASTER, 1, Float.parseFloat(Double.toString(1.5)),false);
				world.playSoundAtBlockCenter(pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.MASTER, 1, 1,false);
			}
			}
		}
	}