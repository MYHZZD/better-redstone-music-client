package net.arcueid.brmc.gui;

import net.arcueid.brmc.ModInfo;
import net.arcueid.brmc.config.Configs;
import top.hendrixshen.magiclib.config.ConfigManager;
import top.hendrixshen.magiclib.gui.ConfigGui;

public class GuiConfigs extends ConfigGui {

    private static GuiConfigs INSTANCE;

    private GuiConfigs(String identifier, String defaultTab, ConfigManager configManager) {
        super(identifier, defaultTab, configManager, () -> ModInfo.translate("gui.title.configs", ModInfo.MOD_VERSION));
    }


    public static GuiConfigs getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GuiConfigs(ModInfo.MOD_ID, Configs.ConfigCategory.GENERIC, ConfigManager.get(ModInfo.MOD_ID));
        }
        return INSTANCE;
    }
}
