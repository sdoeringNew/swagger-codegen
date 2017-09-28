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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LongEnum;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectWithLongEnum
 */

public class ObjectWithLongEnum {
  /**
   * Gets or Sets innerEnum
   */
  public enum InnerEnumEnum {
    NUMBER_10(10L),
    
    NUMBER_20(20L),
    
    NUMBER_30(30L);

    private Long value;

    InnerEnumEnum(Long value) {
      this.value = value;
    }

    @JsonValue
    public Long getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InnerEnumEnum fromValue(String text) {
      for (InnerEnumEnum b : InnerEnumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("innerEnum")
  private InnerEnumEnum innerEnum = null;

  /**
   * Gets or Sets arrayWithInnerEnum
   */
  public enum ArrayWithInnerEnumEnum {
    NUMBER_100(100L),
    
    NUMBER_200(200L),
    
    NUMBER_300(300L);

    private Long value;

    ArrayWithInnerEnumEnum(Long value) {
      this.value = value;
    }

    @JsonValue
    public Long getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrayWithInnerEnumEnum fromValue(String text) {
      for (ArrayWithInnerEnumEnum b : ArrayWithInnerEnumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("arrayWithInnerEnum")
  private List<ArrayWithInnerEnumEnum> arrayWithInnerEnum = null;

  @JsonProperty("arrayWithOuterEnum")
  private List<LongEnum> arrayWithOuterEnum = null;

  public ObjectWithLongEnum innerEnum(InnerEnumEnum innerEnum) {
    this.innerEnum = innerEnum;
    return this;
  }

   /**
   * Get innerEnum
   * @return innerEnum
  **/
  @ApiModelProperty(value = "")
  public InnerEnumEnum getInnerEnum() {
    return innerEnum;
  }

  public void setInnerEnum(InnerEnumEnum innerEnum) {
    this.innerEnum = innerEnum;
  }

  public ObjectWithLongEnum arrayWithInnerEnum(List<ArrayWithInnerEnumEnum> arrayWithInnerEnum) {
    this.arrayWithInnerEnum = arrayWithInnerEnum;
    return this;
  }

  public ObjectWithLongEnum addArrayWithInnerEnumItem(ArrayWithInnerEnumEnum arrayWithInnerEnumItem) {
    if (this.arrayWithInnerEnum == null) {
      this.arrayWithInnerEnum = new ArrayList<ArrayWithInnerEnumEnum>();
    }
    this.arrayWithInnerEnum.add(arrayWithInnerEnumItem);
    return this;
  }

   /**
   * Get arrayWithInnerEnum
   * @return arrayWithInnerEnum
  **/
  @ApiModelProperty(value = "")
  public List<ArrayWithInnerEnumEnum> getArrayWithInnerEnum() {
    return arrayWithInnerEnum;
  }

  public void setArrayWithInnerEnum(List<ArrayWithInnerEnumEnum> arrayWithInnerEnum) {
    this.arrayWithInnerEnum = arrayWithInnerEnum;
  }

  public ObjectWithLongEnum arrayWithOuterEnum(List<LongEnum> arrayWithOuterEnum) {
    this.arrayWithOuterEnum = arrayWithOuterEnum;
    return this;
  }

  public ObjectWithLongEnum addArrayWithOuterEnumItem(LongEnum arrayWithOuterEnumItem) {
    if (this.arrayWithOuterEnum == null) {
      this.arrayWithOuterEnum = new ArrayList<LongEnum>();
    }
    this.arrayWithOuterEnum.add(arrayWithOuterEnumItem);
    return this;
  }

   /**
   * Get arrayWithOuterEnum
   * @return arrayWithOuterEnum
  **/
  @ApiModelProperty(value = "")
  public List<LongEnum> getArrayWithOuterEnum() {
    return arrayWithOuterEnum;
  }

  public void setArrayWithOuterEnum(List<LongEnum> arrayWithOuterEnum) {
    this.arrayWithOuterEnum = arrayWithOuterEnum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWithLongEnum objectWithLongEnum = (ObjectWithLongEnum) o;
    return Objects.equals(this.innerEnum, objectWithLongEnum.innerEnum) &&
        Objects.equals(this.arrayWithInnerEnum, objectWithLongEnum.arrayWithInnerEnum) &&
        Objects.equals(this.arrayWithOuterEnum, objectWithLongEnum.arrayWithOuterEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerEnum, arrayWithInnerEnum, arrayWithOuterEnum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithLongEnum {\n");
    
    sb.append("    innerEnum: ").append(toIndentedString(innerEnum)).append("\n");
    sb.append("    arrayWithInnerEnum: ").append(toIndentedString(arrayWithInnerEnum)).append("\n");
    sb.append("    arrayWithOuterEnum: ").append(toIndentedString(arrayWithOuterEnum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

