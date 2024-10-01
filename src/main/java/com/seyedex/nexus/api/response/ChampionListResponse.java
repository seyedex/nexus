package com.seyedex.nexus.api.response;

import lombok.Data;

import java.util.Map;

@Data
public class ChampionListResponse {

    private String type;
    private String format;
    private String version;
    private Map<String, ChampionResponse> data;

}
