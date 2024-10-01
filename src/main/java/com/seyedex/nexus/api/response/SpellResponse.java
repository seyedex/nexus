package com.seyedex.nexus.api.response;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SpellResponse {

    private String id;
    private String name;
    private String description;
    private String tooltip;
    private Map<String, List<String>> leveltip;
    private Integer maxrank;
    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Double> cost;
    private String costBurn;
    private String effect;
    private String effectBurn;
    private String costType;
    private String maxammo;
    private List<Double> range;
    private String rangeBurn;
    private ImageResponse image;

}
