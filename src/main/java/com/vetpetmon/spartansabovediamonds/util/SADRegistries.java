package com.vetpetmon.spartansabovediamonds.util;

import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
import com.oblivioussp.spartanweaponry.item.*;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import com.vetpetmon.spartansabovediamonds.Constants;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedHashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class SADRegistries {

    public SADRegistries() {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {
        Set<Item> item_set = new LinkedHashSet<>();
        for (ToolMaterialEx mat:Constants.materialsOAD){
            if (!ConfigHandler.disableKatana) {
                ItemKatana katana = new ItemKatana("katana_"+mat.getUnlocName(),mat);
                ModelRenderRegistry.addItemToRegistry(katana, new ResourceLocation(Constants.modID, "katana_custom"), mat);
                item_set.add(katana);
            }
            if (!ConfigHandler.disableGreatsword) {
                ItemGreatsword greatsword = new ItemGreatsword("greatsword_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(greatsword, new ResourceLocation(Constants.modID, "greatsword_custom"), mat);
                item_set.add(greatsword);
            }
            if (!ConfigHandler.disableLongsword) {
                ItemLongsword longsword = new ItemLongsword("longsword_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(longsword, new ResourceLocation(Constants.modID, "longsword_custom"), mat);
                item_set.add(longsword);
            }
            if (!ConfigHandler.disableSaber) {
                ItemSaber saber = new ItemSaber("saber_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(saber, new ResourceLocation(Constants.modID, "saber_custom"), mat);
                item_set.add(saber);
            }
            if (!ConfigHandler.disableRapier) {
                ItemRapier rapier = new ItemRapier("rapier_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(rapier, new ResourceLocation(Constants.modID, "rapier_custom"), mat);
                item_set.add(rapier);
            }
            if (!ConfigHandler.disableDagger) {
                ItemDagger dagger = new ItemDagger("dagger_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(dagger, new ResourceLocation(Constants.modID, "dagger_custom"), mat);
                item_set.add(dagger);
            }
            if (!ConfigHandler.disableSpear) {
                ItemSpear spear = new ItemSpear("spear_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(spear, new ResourceLocation(Constants.modID, "spear_custom"), mat);
                item_set.add(spear);
            }
            if (!ConfigHandler.disablePike) {
                ItemPike pike = new ItemPike("pike_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(pike, new ResourceLocation(Constants.modID, "pike_custom"), mat);
                item_set.add(pike);
            }
            if (!ConfigHandler.disableLance) {
                ItemLance lance = new ItemLance("lance_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(lance, new ResourceLocation(Constants.modID, "lance_custom"), mat);
                item_set.add(lance);
            }
            if (!ConfigHandler.disableHalberd) {
                ItemHalberd halberd = new ItemHalberd("halberd_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(halberd, new ResourceLocation(Constants.modID, "halberd_custom"), mat);
                item_set.add(halberd);
            }
            if (!ConfigHandler.disableWarhammer) {
                ItemWarhammer warhammer = new ItemWarhammer("warhammer_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(warhammer, new ResourceLocation(Constants.modID, "warhammer_custom"), mat);
                item_set.add(warhammer);
            }
            if (!ConfigHandler.disableHammer) {
                ItemHammer hammer = new ItemHammer("hammer_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(hammer, new ResourceLocation(Constants.modID, "hammer_custom"), mat);
                item_set.add(hammer);
            }
            if (!ConfigHandler.disableThrowingAxe) {
                ItemThrowingAxe throwing_axe = new ItemThrowingAxe("throwing_axe_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_axe, new ResourceLocation(Constants.modID, "throwing_axe_custom"), mat);
                item_set.add(throwing_axe);
            }
            if (!ConfigHandler.disableThrowingKnife) {
                ItemThrowingKnife throwing_knife = new ItemThrowingKnife("throwing_knife_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_knife, new ResourceLocation(Constants.modID, "throwing_knife_custom"), mat);
                item_set.add(throwing_knife);
            }
            if (!ConfigHandler.disableLongbow && !ConfigHandler.woodenLongbowOnly) {
                ItemLongbow longbow = new ItemLongbow("longbow_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(longbow, new ResourceLocation(Constants.modID, "longbow_custom"), mat);
                item_set.add(longbow);
            }
            if (!ConfigHandler.disableCrossbow && !ConfigHandler.woodenCrossbowOnly) {
                ItemCrossbow crossbow = new ItemCrossbow("crossbow_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(crossbow, new ResourceLocation(Constants.modID, "crossbow_custom"), mat);
                item_set.add(crossbow);
            }
            if (!ConfigHandler.disableJavelin) {
                ItemJavelin javelin = new ItemJavelin("javelin_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(javelin, new ResourceLocation(Constants.modID, "javelin_custom"), mat);
                item_set.add(javelin);
            }
            if (!ConfigHandler.disableBattleaxe) {
                ItemBattleaxe battle_axe = new ItemBattleaxe("battle_axe_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(battle_axe, new ResourceLocation(Constants.modID, "battle_axe_custom"), mat);
                item_set.add(battle_axe);
            }
            if (!ConfigHandler.disableBoomerang && !ConfigHandler.woodenBoomerangOnly) {
                ItemBoomerang boomerang = new ItemBoomerang("boomerang_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(boomerang, new ResourceLocation(Constants.modID, "boomerang_custom"), mat);
                item_set.add(boomerang);
            }
            if (!ConfigHandler.disableMace) {
                ItemMace mace = new ItemMace("mace_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(mace, new ResourceLocation(Constants.modID, "mace_custom"), mat);
                item_set.add(mace);
            }
            if (!ConfigHandler.disableParryingDagger){
                ItemParryingDagger parrying_dagger = new ItemParryingDagger("parrying_dagger_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(parrying_dagger, new ResourceLocation(Constants.modID, "parrying_dagger_custom"), mat);
                item_set.add(parrying_dagger);
            }
            if (!ConfigHandler.disableQuarterstaff){
                ItemQuarterstaff quarterstaff = new ItemQuarterstaff(
                        "staff_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(quarterstaff, new ResourceLocation(Constants.modID, "staff_custom"), mat);
                item_set.add(quarterstaff);
            }
            if (!ConfigHandler.disableGlaive){
                ItemGlaive glaive = new ItemGlaive(
                        "glaive_" + mat.getUnlocName(), mat);
                ModelRenderRegistry.addItemToRegistry(glaive, new ResourceLocation(Constants.modID, "glaive_custom"), mat);
                item_set.add(glaive);
            }
        }
        for (Item i : item_set){
            i.setCreativeTab(CreativeTabsSW.TAB_SW_MOD);
            ev.getRegistry().register(i);
        }
    }
}
