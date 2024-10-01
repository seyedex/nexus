package com.seyedex.nexus.converter;

import com.seyedex.nexus.api.response.PassiveResponse;
import com.seyedex.nexus.champion.Passive;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PassiveResponseConverter implements Converter<PassiveResponse, Passive> {

    private final ImageResponseConverter imageResponseConverter;

    @Override
    public Passive convert(PassiveResponse passiveResponse) {
        return Passive.builder()
                .name(passiveResponse.getName())
                .description(passiveResponse.getDescription())
                .image(imageResponseConverter.convert(passiveResponse.getImage()))
                .build();
    }

}
