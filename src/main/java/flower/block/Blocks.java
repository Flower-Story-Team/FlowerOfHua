package flower.block;

import flower.FlowerOfHua;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    public static final DeferredRegister<Block> REGISTRY =
            new DeferredRegister<>(ForgeRegistries.BLOCKS, FlowerOfHua.MOD_ID);

    public Blocks(IEventBus bus) {
        FlowerOfHua.getInstance().getLog().info("Registering blocks.");
        REGISTRY.register(bus);
    }
}
