package net.hoys.turtlemod.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(NetherPortal.class)
@Debug(export = true)
public abstract class NetherPortalBlockMixin {/*extends NetherPortal{
	// @Inject(at = @At("HEAD"), method = "AbstractBlock.ContextPredicate")

	public NetherPortalBlockMixin(WorldAccess world, BlockPos pos, Direction.Axis axis) {
		super(world, pos, axis);
	}
*/
	private static AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK = (state, world, pos) -> state.isOf(Blocks.CRYING_OBSIDIAN);
	// This code is injected into the start of MinecraftServer.loadWorld()V


}
