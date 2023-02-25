package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetPasswordResponseModel {
    @JsonProperty("sitekey")
    private String siteKey;
    private String status;
    private String action;
}
