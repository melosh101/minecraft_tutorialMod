package tk.melosh.tutorialmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

@SuppressWarnings("NullableProblems")
public class ModItemGrouping {
    public static final ItemGroup ITEM_GROUP = new ItemGroup("TutorialModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.amethyst.get());
        }
    };
}
