/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DoubleEnum
 */
public enum DoubleEnum {
  
  NUMBER_1_DOT_0(1.0d),
  
  NUMBER_2_DOT_0(2.0d),
  
  NUMBER_3_DOT_0(3.0d);

  private Double value;

  DoubleEnum(Double value) {
    this.value = value;
  }

  @JsonValue
  public Double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DoubleEnum fromValue(String text) {
    for (DoubleEnum b : DoubleEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

