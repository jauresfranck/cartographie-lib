package fr.cours.info.tp.ferrovaire.api.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.cours.info.tp.ferrovaire.api.models.Wagon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Train
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-25T16:23:50.329334900+01:00[Europe/Paris]")
public class Train {

  private String matricule;

  private Integer vitesseMax;

  @Valid
  private List<@Valid Wagon> wagons;

  public Train() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Train(String matricule) {
    this.matricule = matricule;
  }

  public Train matricule(String matricule) {
    this.matricule = matricule;
    return this;
  }

  /**
   * Identifiant unique du train
   * @return matricule
  */
  @NotNull 
  @Schema(name = "matricule", description = "Identifiant unique du train", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matricule")
  public String getMatricule() {
    return matricule;
  }

  public void setMatricule(String matricule) {
    this.matricule = matricule;
  }

  public Train vitesseMax(Integer vitesseMax) {
    this.vitesseMax = vitesseMax;
    return this;
  }

  /**
   * Vitesse maximale autorisée
   * @return vitesseMax
  */
  
  @Schema(name = "vitesseMax", description = "Vitesse maximale autorisée", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vitesseMax")
  public Integer getVitesseMax() {
    return vitesseMax;
  }

  public void setVitesseMax(Integer vitesseMax) {
    this.vitesseMax = vitesseMax;
  }

  public Train wagons(List<@Valid Wagon> wagons) {
    this.wagons = wagons;
    return this;
  }

  public Train addWagonsItem(Wagon wagonsItem) {
    if (this.wagons == null) {
      this.wagons = new ArrayList<>();
    }
    this.wagons.add(wagonsItem);
    return this;
  }

  /**
   * Get wagons
   * @return wagons
  */
  @Valid 
  @Schema(name = "wagons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wagons")
  public List<@Valid Wagon> getWagons() {
    return wagons;
  }

  public void setWagons(List<@Valid Wagon> wagons) {
    this.wagons = wagons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Train train = (Train) o;
    return Objects.equals(this.matricule, train.matricule) &&
        Objects.equals(this.vitesseMax, train.vitesseMax) &&
        Objects.equals(this.wagons, train.wagons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matricule, vitesseMax, wagons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Train {\n");
    sb.append("    matricule: ").append(toIndentedString(matricule)).append("\n");
    sb.append("    vitesseMax: ").append(toIndentedString(vitesseMax)).append("\n");
    sb.append("    wagons: ").append(toIndentedString(wagons)).append("\n");
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

