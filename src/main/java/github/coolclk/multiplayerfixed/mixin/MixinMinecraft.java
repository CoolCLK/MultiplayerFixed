package github.coolclk.multiplayerfixed.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(at = @At(value = "RETURN"), method = "createTitle", cancellable = true)
    public void createTitle(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(I18n.get("title.multiplayer.fixed", cir.getReturnValue()));
    }

    @Inject(at = @At(value = "RETURN"), method = "allowsMultiplayer", cancellable = true)
    public void allowsMultiplayer(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }

    @Inject(at = @At(value = "RETURN"), method = "allowsChat", cancellable = true)
    public void allowsChat(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
