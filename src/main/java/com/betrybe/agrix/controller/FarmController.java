package com.betrybe.agrix.controller;

import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.service.FarmServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Farm controller.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {
  private final FarmServiceInterface farmService;

  /**
   * Instantiates a new Farm controller.
   *
   * @param farmService the farm service
   */
  @Autowired
  public FarmController(FarmServiceInterface farmService) {
    this.farmService = farmService;
  }

  /**
   * Post new farm response entity.
   *
   * @param farm the farm
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<Farm> postNewFarm(@RequestBody Farm farm) {
    Farm createdFarm = farmService.createFarm(farm);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdFarm);
  }
}
