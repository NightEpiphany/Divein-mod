package com.moigferdsrte.divein.compact;

import com.moigferdsrte.divein.config.DiveinConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.AutoConfigClient;

public class ConfigMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return s -> AutoConfigClient.getConfigScreen(DiveinConfig.class, s).get();
    }
}
