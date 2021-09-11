package com.refactorizando.example.record.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record BrandDto(@JsonProperty("id") Long id, @JsonProperty("name") String name) {
}
