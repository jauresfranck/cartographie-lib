package fr.cours.info.tp.ferrovaire.api.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Wagon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-25T16:23:50.329334900+01:00[Europe/Paris]")
public class Wagon {

  private String id;

  private Integer capacite;

  public Wagon id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Wagon capacite(Integer capacite) {
    this.capacite = capacite;
    return this;
  }

  /**
   * Get capacite
   * @return capacite
  */
  
  @Schema(name = "capacite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacite")
  public Integer getCapacite() {
    return capacite;
  }

  public void setCapacite(Integer capacite) {
    this.capacite = capacite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wagon wagon = (Wagon) o;
    return Objects.equals(this.id, wagon.id) &&
        Objects.equals(this.capacite, wagon.capacite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, capacite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wagon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    capacite: ").append(toIndentedString(capacite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

