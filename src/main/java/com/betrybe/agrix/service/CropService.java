package com.betrybe.agrix.service;

import com.betrybe.agrix.exceptions.CropNotFoundException;
import com.betrybe.agrix.exceptions.FarmNotFoundException;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.CropRepository;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Crop service.
 */
@Service
public class CropService implements CropServiceInterface {

  private final CropRepository cropRepository;
  private final FarmRepository farmRepository;

  /**
   * Instantiates a new Crop service.
   *
   * @param cropRepository the crop repository
   * @param farmRepository the farm repository
   */
  @Autowired
  public CropService(CropRepository cropRepository, FarmRepository farmRepository) {
    this.cropRepository = cropRepository;
    this.farmRepository = farmRepository;
  }

  @Override
  public Crop createCrop(Long farmId, Crop crop) {
    Optional<Farm> optionalFarm = farmRepository.findById(farmId);

    if (optionalFarm.isEmpty()) {
      throw new FarmNotFoundException();
    }
    crop.setFarm(optionalFarm.get());

    return cropRepository.save(crop);
  }

  @Override
  public List<Crop> getFarmCrops(Long farmId) {
    Optional<Farm> optionalFarm = farmRepository.findById(farmId);

    if (optionalFarm.isEmpty()) {
      throw new FarmNotFoundException();
    }
    return optionalFarm.get().getCrops();
  }

  @Override
  public List<Crop> getAll() {
    return cropRepository.findAll();
  }

  @Override
  public Crop getCropById(Long id) {
    Optional<Crop> crop = cropRepository.findById(id);

    if (crop.isEmpty()) {
      throw new CropNotFoundException();
    }

    return crop.get();
  }

}
