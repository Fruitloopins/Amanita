package com.fwloopins.amanita.client.object;

import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public enum ParticleEffects {
    ASH(net.minecraft.particle.ParticleTypes.ASH),
    AMBIENT_ENTITY_EFFECT(ParticleTypes.AMBIENT_ENTITY_EFFECT),
    ANGRY_VILLAGER(ParticleTypes.ANGRY_VILLAGER),
    BUBBLE(ParticleTypes.BUBBLE),
    CLOUD(ParticleTypes.CLOUD),
    CRIT(ParticleTypes.CRIT),
    DAMAGE_INDICATOR(ParticleTypes.DAMAGE_INDICATOR),
    DRAGON_BREATH(ParticleTypes.DRAGON_BREATH),
    DRIPPING_LAVA(ParticleTypes.DRIPPING_LAVA),
    FALLING_LAVA(ParticleTypes.FALLING_LAVA),
    LANDING_LAVA(ParticleTypes.LANDING_LAVA),
    DRIPPING_WATER(ParticleTypes.DRIPPING_WATER),
    FALLING_WATER(ParticleTypes.FALLING_WATER),
    EFFECT(ParticleTypes.EFFECT),
    ENCHANTED_HIT(ParticleTypes.ENCHANTED_HIT),
    ENCHANT(ParticleTypes.ENCHANT),
    END_ROD(ParticleTypes.END_ROD),
    ENTITY_EFFECT(ParticleTypes.ENTITY_EFFECT),
    EXPLOSION_EMITTER(ParticleTypes.EXPLOSION_EMITTER),
    EXPLOSION(ParticleTypes.EXPLOSION),
    SONIC_BOOM(ParticleTypes.SONIC_BOOM),
    FIREWORK(ParticleTypes.FIREWORK),
    FISHING(ParticleTypes.FISHING),
    FLAME(ParticleTypes.FLAME),
    CHERRY_LEAVES(ParticleTypes.CHERRY_LEAVES),
    SCULK_SOUL(ParticleTypes.SCULK_SOUL),
    SCULK_CHARGE_POP(ParticleTypes.SCULK_CHARGE_POP),
    SOUL_FIRE_FLAME(ParticleTypes.SOUL_FIRE_FLAME),
    SOUL(ParticleTypes.SOUL),
    FLASH(ParticleTypes.FLASH),
    HAPPY_VILLAGER(ParticleTypes.HAPPY_VILLAGER),
    COMPOSTER(ParticleTypes.COMPOSTER),
    HEART(ParticleTypes.HEART),
    INSTANT_EFFECT(ParticleTypes.INSTANT_EFFECT),
    ITEM_SLIME(ParticleTypes.ITEM_SLIME),
    ITEM_SNOWBALL(ParticleTypes.ITEM_SNOWBALL),
    LARGE_SMOKE(ParticleTypes.LARGE_SMOKE),
    LAVA(ParticleTypes.LAVA),
    MYCELIUM(ParticleTypes.MYCELIUM),
    NOTE(ParticleTypes.NOTE),
    POOF(ParticleTypes.POOF),
    PORTAL(ParticleTypes.PORTAL),
    RAIN(ParticleTypes.RAIN),
    SMOKE(ParticleTypes.SMOKE),
    SNEEZE(ParticleTypes.SNEEZE),
    SPIT(ParticleTypes.SPIT),
    SQUID_INK(ParticleTypes.SQUID_INK),
    SWEEP_ATTACK(ParticleTypes.SWEEP_ATTACK),
    TOTEM_OF_UNDYING(ParticleTypes.TOTEM_OF_UNDYING),
    UNDERWATER(ParticleTypes.UNDERWATER),
    SPLASH(ParticleTypes.SPLASH),
    WITCH(ParticleTypes.WITCH),
    BUBBLE_POP(ParticleTypes.BUBBLE_POP),
    CURRENT_DOWN(ParticleTypes.CURRENT_DOWN),
    BUBBLE_COLUMN_UP(ParticleTypes.BUBBLE_COLUMN_UP),
    NAUTILUS(ParticleTypes.NAUTILUS),
    DOLPHIN(ParticleTypes.DOLPHIN),
    CAMPFIRE_COSY_SMOKE(ParticleTypes.CAMPFIRE_COSY_SMOKE),
    CAMPFIRE_SIGNAL_SMOKE(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE),
    DRIPPING_HONEY(ParticleTypes.DRIPPING_HONEY),
    FALLING_HONEY(ParticleTypes.FALLING_HONEY),
    LANDING_HONEY(ParticleTypes.LANDING_HONEY),
    FALLING_NECTAR(ParticleTypes.FALLING_NECTAR),
    FALLING_SPORE_BLOSSOM(ParticleTypes.FALLING_SPORE_BLOSSOM),
    CRIMSON_SPORE(ParticleTypes.CRIMSON_SPORE),
    WARPED_SPORE(ParticleTypes.WARPED_SPORE),
    SPORE_BLOSSOM_AIR(ParticleTypes.SPORE_BLOSSOM_AIR),
    DRIPPING_OBSIDIAN_TEAR(ParticleTypes.DRIPPING_OBSIDIAN_TEAR),
    FALLING_OBSIDIAN_TEAR(ParticleTypes.FALLING_OBSIDIAN_TEAR),
    LANDING_OBSIDIAN_TEAR(ParticleTypes.LANDING_OBSIDIAN_TEAR),
    REVERSE_PORTAL(ParticleTypes.REVERSE_PORTAL),
    WHITE_ASH(ParticleTypes.WHITE_ASH),
    SMALL_FLAME(ParticleTypes.SMALL_FLAME),
    SNOWFLAKE(ParticleTypes.SNOWFLAKE),
    DRIPPING_DRIPSTONE_LAVA(ParticleTypes.DRIPPING_DRIPSTONE_LAVA),
    FALLING_DRIPSTONE_LAVA(ParticleTypes.FALLING_DRIPSTONE_LAVA),
    DRIPPING_DRIPSTONE_WATER(ParticleTypes.DRIPPING_DRIPSTONE_WATER),
    FALLING_DRIPSTONE_WATER(ParticleTypes.FALLING_DRIPSTONE_WATER),
    GLOW_SQUID_INK(ParticleTypes.GLOW_SQUID_INK),
    GLOW(ParticleTypes.GLOW),
    WAX_ON(ParticleTypes.WAX_ON),
    WAX_OFF(ParticleTypes.WAX_OFF),
    ELECTRIC_SPARK(ParticleTypes.ELECTRIC_SPARK),
    SCRAPE(ParticleTypes.SCRAPE),
    EGG_CRACK(ParticleTypes.EGG_CRACK);

    private final DefaultParticleType particleType;

    ParticleEffects(DefaultParticleType particleType) {
        this.particleType = particleType;
    }

    @NotNull
    public DefaultParticleType particle() {
        return this.particleType;
    }
}
