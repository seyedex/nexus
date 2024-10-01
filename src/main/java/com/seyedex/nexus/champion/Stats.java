package com.seyedex.nexus.champion;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Stats {

    private Double hp;
    private Double hpPerLevel;
    private Double magicPower;
    private Double magicPowerPerLevel;
    private Double moveSpeed;
    private Double armor;
    private Double armorPerLevel;
    private Double spellBlock;
    private Double spellBlockPerLevel;
    private Double attackRange;
    private Double hpRegen;
    private Double hpRegenPerLevel;
    private Double magicPowerRegen;
    private Double magicPowerRegenPerLevel;
    private Double crit;
    private Double critPerLevel;
    private Double attackDamage;
    private Double attackDamagePerLevel;
    private Double attackSpeed;
    private Double attackSpeedPerLevel;

}
