package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductModel {
    private String category;
    @JsonProperty("total_quantity")
    private int totalQuantity;
}
