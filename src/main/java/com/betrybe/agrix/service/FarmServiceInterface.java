package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Farm;

/**
 * The interface Farm service interface.
 */
public interface FarmServiceInterface {

  /**
   * Create farm.
   *
   * @param farm the farm
   * @return the farm
   */
  Farm createFarm(Farm farm);
}
