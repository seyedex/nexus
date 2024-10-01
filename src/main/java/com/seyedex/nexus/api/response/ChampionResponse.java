package com.seyedex.nexus.api.response;

import com.seyedex.nexus.champion.Info;
import com.seyedex.nexus.champion.Skin;
import lombok.Data;

import java.util.List;

@Data
public class ChampionResponse {

    private String id;
    private String key;
    private String name;
    private String title;
    private List<Skin> skins; // not in the champion.json
    private String lore; // not in the champion.json
    private String blurb;
    private List<String> allytips; // not in the champion.json
    private List<String> enemytips; // not in the champion.json
    private List<String> tags;
    private String partype;
    private Info info;
    private StatsResponse stats;
    private List<SpellResponse> spells; // not in the champion.json
    private PassiveResponse passive; // not in the champion.json

}
