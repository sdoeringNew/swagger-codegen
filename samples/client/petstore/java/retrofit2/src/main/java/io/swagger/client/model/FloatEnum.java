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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FloatEnum
 */
@JsonAdapter(FloatEnum.Adapter.class)
public enum FloatEnum {
  
  NUMBER_1_DOT_0(1.0f),
  
  NUMBER_2_DOT_0(2.0f),
  
  NUMBER_3_DOT_0(3.0f);

  private Float value;

  FloatEnum(Float value) {
    this.value = value;
  }

  public Float getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FloatEnum fromValue(String text) {
    for (FloatEnum b : FloatEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FloatEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FloatEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FloatEnum read(final JsonReader jsonReader) throws IOException {
      Float value = new Float(jsonReader.nextDouble()); // floats shall be restricted so this cast is safe
      return FloatEnum.fromValue(String.valueOf(value));
    }
  }
}

