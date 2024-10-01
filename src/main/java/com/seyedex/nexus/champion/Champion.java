package com.seyedex.nexus.champion;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Champion {

    private String id;
    private String key;
    private String name;
    private String title;
    private List<Skin> skins; // not in the champion.json
    private String lore; // not in the champion.json
    private String blurb;
    private List<String> allyTips; // not in the champion.json
    private List<String> enemyTips; // not in the champion.json
    private List<String> tags;
    private String partype;
    private Info info;
    private Stats stats;
    private List<Spell> spells; // not in the champion.json
    private Passive passive; // not in the champion.json

}
