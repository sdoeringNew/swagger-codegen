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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DoubleEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * ObjectWithDoubleEnum
 */

public class ObjectWithDoubleEnum implements Parcelable {
  /**
   * Gets or Sets innerEnum
   */
  @JsonAdapter(InnerEnumEnum.Adapter.class)
  public enum InnerEnumEnum {
    NUMBER_10_DOT_0(10.0d),
    
    NUMBER_20_DOT_0(20.0d),
    
    NUMBER_30_DOT_0(30.0d);

    private Double value;

    InnerEnumEnum(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InnerEnumEnum fromValue(String text) {
      for (InnerEnumEnum b : InnerEnumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InnerEnumEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnumEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InnerEnumEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextDouble();
        return InnerEnumEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("innerEnum")
  private InnerEnumEnum innerEnum = null;

  /**
   * Gets or Sets arrayWithInnerEnum
   */
  @JsonAdapter(ArrayWithInnerEnumEnum.Adapter.class)
  public enum ArrayWithInnerEnumEnum {
    NUMBER_100_DOT_0(100.0d),
    
    NUMBER_200_DOT_0(200.0d),
    
    NUMBER_300_DOT_0(300.0d);

    private Double value;

    ArrayWithInnerEnumEnum(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArrayWithInnerEnumEnum fromValue(String text) {
      for (ArrayWithInnerEnumEnum b : ArrayWithInnerEnumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ArrayWithInnerEnumEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArrayWithInnerEnumEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArrayWithInnerEnumEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextDouble();
        return ArrayWithInnerEnumEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("arrayWithInnerEnum")
  private List<ArrayWithInnerEnumEnum> arrayWithInnerEnum = null;

  @SerializedName("arrayWithOuterEnum")
  private List<DoubleEnum> arrayWithOuterEnum = null;

  public ObjectWithDoubleEnum innerEnum(InnerEnumEnum innerEnum) {
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

  public ObjectWithDoubleEnum arrayWithInnerEnum(List<ArrayWithInnerEnumEnum> arrayWithInnerEnum) {
    this.arrayWithInnerEnum = arrayWithInnerEnum;
    return this;
  }

  public ObjectWithDoubleEnum addArrayWithInnerEnumItem(ArrayWithInnerEnumEnum arrayWithInnerEnumItem) {
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

  public ObjectWithDoubleEnum arrayWithOuterEnum(List<DoubleEnum> arrayWithOuterEnum) {
    this.arrayWithOuterEnum = arrayWithOuterEnum;
    return this;
  }

  public ObjectWithDoubleEnum addArrayWithOuterEnumItem(DoubleEnum arrayWithOuterEnumItem) {
    if (this.arrayWithOuterEnum == null) {
      this.arrayWithOuterEnum = new ArrayList<DoubleEnum>();
    }
    this.arrayWithOuterEnum.add(arrayWithOuterEnumItem);
    return this;
  }

   /**
   * Get arrayWithOuterEnum
   * @return arrayWithOuterEnum
  **/
  @ApiModelProperty(value = "")
  public List<DoubleEnum> getArrayWithOuterEnum() {
    return arrayWithOuterEnum;
  }

  public void setArrayWithOuterEnum(List<DoubleEnum> arrayWithOuterEnum) {
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
    ObjectWithDoubleEnum objectWithDoubleEnum = (ObjectWithDoubleEnum) o;
    return Objects.equals(this.innerEnum, objectWithDoubleEnum.innerEnum) &&
        Objects.equals(this.arrayWithInnerEnum, objectWithDoubleEnum.arrayWithInnerEnum) &&
        Objects.equals(this.arrayWithOuterEnum, objectWithDoubleEnum.arrayWithOuterEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerEnum, arrayWithInnerEnum, arrayWithOuterEnum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithDoubleEnum {\n");
    
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

  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(innerEnum);

    out.writeValue(arrayWithInnerEnum);

    out.writeValue(arrayWithOuterEnum);
  }

  public ObjectWithDoubleEnum() {
    super();
  }

  ObjectWithDoubleEnum(Parcel in) {
    
    innerEnum = (InnerEnumEnum)in.readValue(null);
    arrayWithInnerEnum = (List<ArrayWithInnerEnumEnum>)in.readValue(null);
    arrayWithOuterEnum = (List<DoubleEnum>)in.readValue(DoubleEnum.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ObjectWithDoubleEnum> CREATOR = new Parcelable.Creator<ObjectWithDoubleEnum>() {
    public ObjectWithDoubleEnum createFromParcel(Parcel in) {
      return new ObjectWithDoubleEnum(in);
    }
    public ObjectWithDoubleEnum[] newArray(int size) {
      return new ObjectWithDoubleEnum[size];
    }
  };
}

