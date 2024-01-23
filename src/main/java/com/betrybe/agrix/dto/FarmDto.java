package com.betrybe.agrix.dto;

import com.betrybe.agrix.models.entities.Farm;

/**
 * The type Farm dto.
 */
public record FarmDto(
    Long id,
    String name,
    Double size,
    Long crops) {

  /**
   * Farm to dto farm dto.
   *
   * @param farm the farm
   * @return the farm dto
   */
  public static FarmDto farmToDto(Farm farm) {
    return new FarmDto(
        farm.getId(),
        farm.getName(),
        farm.getSize(),
        null
    );
  }


}
