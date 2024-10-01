package com.seyedex.nexus.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {

    private String full;
    private String group;
    private Integer width;
    private Integer height;

}
