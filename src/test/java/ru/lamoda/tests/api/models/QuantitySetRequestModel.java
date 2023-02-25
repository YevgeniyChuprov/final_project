package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuantitySetRequestModel {
    @JsonProperty("item_selection_enabled")
    private boolean itemSelectionEnabled;
    private int quantity;
    private String sku;
    private City geo;

    @Data
    public static class City{
        @JsonProperty("city_aoid")
        private String cityAoid;
        @JsonProperty("street_aoid")
        private String streetAoid;
    }
}
