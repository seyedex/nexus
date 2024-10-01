package com.seyedex.nexus.champion;

import com.seyedex.nexus.common.Image;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class Spell {

    private String id;
    private String name;
    private String description;
    private String tooltip;
    private Map<String, List<String>> levelTip; // todo change to type
    private Integer maxRank;
    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Double> cost;
    private String costBurn;
    private List<List<String>> effect;
    private List<String> effectBurn;
    private String costType;
    private String maxAmmo;
    private List<Double> range;
    private String rangeBurn;
    private Image image;

}
