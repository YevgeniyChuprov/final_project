package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDiscountResponseModel {
    private String status;
    @JsonProperty("customer_id")
    private int customerId;
    @JsonProperty("email_confirmed")
    private boolean emailConfirmed;
}
