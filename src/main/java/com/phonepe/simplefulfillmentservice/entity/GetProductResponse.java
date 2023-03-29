package com.phonepe.simplefulfillmentservice.entity;

import java.util.Map;

public class GetProductResponse {
    private Map<String,Integer> map;

    public GetProductResponse(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}
