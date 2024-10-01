package com.seyedex.nexus.converter;

import com.seyedex.nexus.api.response.ChampionResponse;
import com.seyedex.nexus.champion.Champion;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChampionResponseConverter implements Converter<ChampionResponse, Champion> {

    private final StatsResponseConverter statsResponseConverter;
    private final SpellResponseConverter spellResponseConverter;
    private final PassiveResponseConverter passiveResponseConverter;

    @Override
    public Champion convert(ChampionResponse championResponse) {
        return Champion.builder()
                .id(championResponse.getId())
                .key(championResponse.getKey())
                .name(championResponse.getName())
                .title(championResponse.getTitle())
                .skins(championResponse.getSkins())
                .lore(championResponse.getLore())
                .blurb(championResponse.getBlurb())
                .allyTips(championResponse.getAllytips())
                .enemyTips(championResponse.getEnemytips())
                .tags(championResponse.getTags())
                .partype(championResponse.getPartype())
                .info(championResponse.getInfo())
                .stats(statsResponseConverter.convert(championResponse.getStats()))
                .spells(championResponse.getSpells().stream()
                        .map(spellResponseConverter::convert)
                        .toList())
                .passive(passiveResponseConverter.convert(championResponse.getPassive()))
                .build();
    }

}
