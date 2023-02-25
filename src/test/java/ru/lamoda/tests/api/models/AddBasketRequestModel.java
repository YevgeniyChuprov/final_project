package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddBasketRequestModel {
    private String sku;
    private City geo;
    private Boolean item_selection_enabled;

    @Data
    public static class City{
        @JsonProperty("city_aoid")
        private String cityAoid;
    }
}
