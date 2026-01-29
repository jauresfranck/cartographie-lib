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
 * Reservation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-25T16:23:50.329334900+01:00[Europe/Paris]")
public class Reservation {

  private String id;

  private String nomPassager;

  public Reservation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Reservation(String id, String nomPassager) {
    this.id = id;
    this.nomPassager = nomPassager;
  }

  public Reservation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Reservation nomPassager(String nomPassager) {
    this.nomPassager = nomPassager;
    return this;
  }

  /**
   * Get nomPassager
   * @return nomPassager
  */
  @NotNull 
  @Schema(name = "nomPassager", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nomPassager")
  public String getNomPassager() {
    return nomPassager;
  }

  public void setNomPassager(String nomPassager) {
    this.nomPassager = nomPassager;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(this.id, reservation.id) &&
        Objects.equals(this.nomPassager, reservation.nomPassager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomPassager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomPassager: ").append(toIndentedString(nomPassager)).append("\n");
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

