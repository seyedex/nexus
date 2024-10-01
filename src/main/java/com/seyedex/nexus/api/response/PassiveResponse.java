package com.seyedex.nexus.api.response;

import lombok.Data;

@Data
public class PassiveResponse {

    private String name;
    private String description;
    private ImageResponse image;

}
