package com.seyedex.nexus.champion;

import com.seyedex.nexus.common.Image;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Passive {

    private String name;
    private String description;
    private Image image;

}
