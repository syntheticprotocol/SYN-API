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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Operation;

/**
 * ConstructionParseResponse contains an array of operations that occur in a transaction blob. This should match the array of operations provided to &#x60;/construction/preprocess&#x60; and &#x60;/construction/payloads&#x60;.
 */
@ApiModel(description = "ConstructionParseResponse contains an array of operations that occur in a transaction blob. This should match the array of operations provided to `/construction/preprocess` and `/construction/payloads`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-01T16:34:45.305718+08:00[Asia/Shanghai]")
public class ConstructionParseResponse {
  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<Operation> operations = new ArrayList<Operation>();

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<String> signers = new ArrayList<String>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;


  public ConstructionParseResponse operations(List<Operation> operations) {
    
    this.operations = operations;
    return this;
  }

  public ConstructionParseResponse addOperationsItem(Operation operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Operation> getOperations() {
    return operations;
  }


  public void setOperations(List<Operation> operations) {
    this.operations = operations;
  }


  public ConstructionParseResponse signers(List<String> signers) {
    
    this.signers = signers;
    return this;
  }

  public ConstructionParseResponse addSignersItem(String signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * All signers of a particular transaction. If the transaction is unsigned, it should be empty.
   * @return signers
  **/
  @ApiModelProperty(required = true, value = "All signers of a particular transaction. If the transaction is unsigned, it should be empty.")

  public List<String> getSigners() {
    return signers;
  }


  public void setSigners(List<String> signers) {
    this.signers = signers;
  }


  public ConstructionParseResponse metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionParseResponse constructionParseResponse = (ConstructionParseResponse) o;
    return Objects.equals(this.operations, constructionParseResponse.operations) &&
        Objects.equals(this.signers, constructionParseResponse.signers) &&
        Objects.equals(this.metadata, constructionParseResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, signers, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionParseResponse {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
