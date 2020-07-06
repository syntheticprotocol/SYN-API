/*
 * Rosetta
 * Build Once. Integrate Your Blockchain Everywhere.
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The block_identifier uniquely identifies a block in a particular network.
 */
@ApiModel(description = "The block_identifier uniquely identifies a block in a particular network.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-01T16:34:45.305718+08:00[Asia/Shanghai]")
public class BlockIdentifier {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Long index;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;


  public BlockIdentifier index(Long index) {
    
    this.index = index;
    return this;
  }

   /**
   * This is also known as the block height.
   * @return index
  **/
  @ApiModelProperty(example = "1123941", required = true, value = "This is also known as the block height.")

  public Long getIndex() {
    return index;
  }


  public void setIndex(Long index) {
    this.index = index;
  }


  public BlockIdentifier hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "0x1f2cc6c5027d2f201a5453ad1119574d2aed23a392654742ac3c78783c071f85", required = true, value = "")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIdentifier blockIdentifier = (BlockIdentifier) o;
    return Objects.equals(this.index, blockIdentifier.index) &&
        Objects.equals(this.hash, blockIdentifier.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIdentifier {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
