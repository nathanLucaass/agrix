package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Crop;
import java.util.List;

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

  List<Crop> getFarmCrops(Long farmId);

  List<Crop> getAll();

  Crop getCropById(Long id);
}
