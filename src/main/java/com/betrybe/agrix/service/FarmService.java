package com.betrybe.agrix.service;

import com.betrybe.agrix.exceptions.FarmNotFoundException;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Farm service.
 */
@Service
public class FarmService implements FarmServiceInterface {

  private final FarmRepository farmRepository;

  /**
   * Instantiates a new Farm service.
   *
   * @param farmRepository the farm repository
   */
  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  @Override
  public Farm createFarm(Farm farm) {
    return farmRepository.save(farm);
  }

  @Override
  public List<Farm> getFarms() {

    return farmRepository.findAll();
  }

  @Override
  public Farm getFarmById(Long id) {
    Optional<Farm> farm = farmRepository.findById(id);

    if (farm.isEmpty()) {
      throw new FarmNotFoundException();
    }

    return farm.get();
  }


}
