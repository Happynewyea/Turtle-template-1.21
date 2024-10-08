package net.hoys.turtlemod.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(NetherPortal.class)
@Debug(export = true)
public class NetherPortalBlockMixin {
	// @Inject(at = @At("HEAD"), method = "AbstractBlock.ContextPredicate")
	private static AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK = (state, world, pos) -> state.isOf(Blocks.CRYING_OBSIDIAN);
	// This code is injected into the start of MinecraftServer.loadWorld()V


}
