package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasketResponseModel {
    @JsonProperty("total_discount")
    private int totalDiscount;
    @JsonProperty("total_quantity")
    private int totalQuantity;
    @JsonProperty("total_price")
    private int totalPrice;
}
