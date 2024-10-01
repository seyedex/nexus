package com.seyedex.nexus.converter;

import com.seyedex.nexus.api.response.ImageResponse;
import com.seyedex.nexus.common.Image;

public class ImageResponseConverter implements Converter<ImageResponse, Image> {

    @Override
    public Image convert(ImageResponse imageResponse) {
        return Image.builder()
                .full(imageResponse.getFull())
                .group(imageResponse.getGroup())
                .width(imageResponse.getW())
                .height(imageResponse.getH())
                .build();
    }
}
