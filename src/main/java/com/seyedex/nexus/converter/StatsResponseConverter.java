package com.seyedex.nexus.converter;

import com.seyedex.nexus.api.response.StatsResponse;
import com.seyedex.nexus.champion.Stats;

public class StatsResponseConverter implements Converter<StatsResponse, Stats> {

    @Override
    public Stats convert(StatsResponse statsResponse) {
        return Stats.builder()
                .hp(statsResponse.getHp())
                .hpPerLevel(statsResponse.getHpperlevel())
                .magicPower(statsResponse.getMp())
                .magicPowerPerLevel(statsResponse.getMpperlevel())
                .moveSpeed(statsResponse.getMovespeed())
                .armor(statsResponse.getArmor())
                .armorPerLevel(statsResponse.getArmorperlevel())
                .spellBlock(statsResponse.getSpellblock())
                .spellBlockPerLevel(statsResponse.getSpellblockperlevel())
                .attackRange(statsResponse.getAttackrange())
                .hpRegen(statsResponse.getHpregen())
                .hpRegenPerLevel(statsResponse.getHpregenperlevel())
                .magicPowerRegen(statsResponse.getMpregen())
                .magicPowerRegenPerLevel(statsResponse.getMpregenperlevel())
                .crit(statsResponse.getCrit())
                .critPerLevel(statsResponse.getCritperlevel())
                .attackDamage(statsResponse.getAttackdamage())
                .attackDamagePerLevel(statsResponse.getAttackdamageperlevel())
                .attackSpeed(statsResponse.getAttackspeed())
                .attackSpeedPerLevel(statsResponse.getAttackspeedperlevel())
                .build();
    }

}
