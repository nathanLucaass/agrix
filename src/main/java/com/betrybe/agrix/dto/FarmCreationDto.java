package com.betrybe.agrix.dto;

import com.betrybe.agrix.models.entities.Farm;

/**
 * The type Farm creation dto.
 */
public record FarmCreationDto(
    Long id,
    String name,
    Double size) {

  /**
   * Farm to farm creation dto.
   *
   * @param farm the farm
   * @return the farm creation dto
   */
  public static FarmCreationDto farmToFarm(Farm farm) {
    return new FarmCreationDto(
        farm.getId(),
        farm.getName(),
        farm.getSize()
    );
  }
}
