package dev.tehc.prideyear.mixin;

import io.github.darkerbit.quiltloadingscreen.QuiltLoadingScreen;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.time.LocalDate;
import java.time.Month;

@Mixin(value = QuiltLoadingScreen.class, remap = false)
public class QuiltLoadingScreenMixin {
	@Redirect(method = "<init>", at = @At(value = "INVOKE", ordinal = 4))
	private Month ctor(LocalDate date, MinecraftClient client) {
		return Month.JUNE;
	}
}
