package github.coolclk.multiplayerfixed.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(at = @At(value = "RETURN"), method = "allowsMultiplayer", cancellable = true)
    public void allowsMultiplayer(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
