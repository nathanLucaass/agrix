package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Crop;

/**
 * The interface Crop service interface.
 */
public interface CropServiceInterface {

  /**
   * Create crop crop.
   *
   * @param farmId the farm id
   * @param crop   the crop
   * @return the crop
   */
  Crop createCrop(Long farmId, Crop crop);
}
