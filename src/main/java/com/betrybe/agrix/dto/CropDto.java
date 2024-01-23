package com.betrybe.agrix.dto;

import com.betrybe.agrix.models.entities.Crop;

/**
 * The type Crop dtop.
 */
public record CropDto(
    Long id,
    String name,
    Double plantedArea,
    Long farmId) {

  /**
   * Crop to dto crop dto.
   *
   * @param crop the crop
   * @return the crop dto
   */
  public static CropDto cropToDto(Crop crop) {
    return new CropDto(
        crop.getId(),
        crop.getName(),
        crop.getPlantedArea(),
        crop.getFarm().getId()
    );
  }
}
