package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RemoveBascetRequestModel {
    private String[] skus;
    private AddBasketRequestModel.City geo;
    private Boolean item_selection_enabled;

    @Data
    public static class City{
        @JsonProperty("city_aoid")
        private String cityAoid;
    }
}
