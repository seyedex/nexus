package com.seyedex.nexus.converter;

import com.seyedex.nexus.api.response.SpellResponse;
import com.seyedex.nexus.champion.Spell;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SpellResponseConverter implements Converter<SpellResponse, Spell> {

    private final ImageResponseConverter imageResponseConverter;

    @Override
    public Spell convert(SpellResponse spellResponse) {
        return Spell.builder()
                .id(spellResponse.getId())
                .name(spellResponse.getName())
                .description(spellResponse.getDescription())
                .tooltip(spellResponse.getTooltip())
                .levelTip(spellResponse.getLeveltip())
                .maxRank(spellResponse.getMaxrank())
                .cooldown(spellResponse.getCooldown())
                .cooldownBurn(spellResponse.getCooldownBurn())
                .cost(spellResponse.getCost())
                .costBurn(spellResponse.getCostBurn())
                .costType(spellResponse.getCostType())
                .maxAmmo(spellResponse.getMaxammo())
                .range(spellResponse.getRange())
                .rangeBurn(spellResponse.getRangeBurn())
                .image(imageResponseConverter.convert(spellResponse.getImage()))
                .build();
    }

}
