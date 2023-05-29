package com.vetpetmon.spartansabovediamonds;

import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import oresAboveDiamonds.config.OADConfig;

public class Constants {
    public static final String modID = "spartansabovediamonds",
            version = "1.0",
            modName = "Spartans above Diamonds",
            modDeps = "required-after:spartanweaponry@[beta-1.3.0,);after:oresabovediamonds",
            mcVer = "1.12.2",
            ProxyClientClass = "com.vetpetmon.spartansabovediamonds.proxy.ClientProxy",
            ProxyServerClass = "com.vetpetmon.spartansabovediamonds.proxy.CommonProxy";

    public static ToolMaterialEx amethyst, black_opal;
    public static final ToolMaterialEx[] materialsOAD = {
            amethyst = new ToolMaterialEx("amethyst","gemAmethyst", Constants.modID, 16747483, 8336008, 4, OADConfig.aq_amethyst_durability, (float) OADConfig.ap_amethyst_efficiency, (float) OADConfig.ao_amethyst_attack_damage, 8),
            black_opal = new ToolMaterialEx("black_opal","gemBlackOpal", Constants.modID, 8716379, 1245243, 5, OADConfig.at_black_opal_durability, (float) OADConfig.as_black_opal_efficiency, (float) OADConfig.ar_black_opal_attack_damage, 12)
    };
}
