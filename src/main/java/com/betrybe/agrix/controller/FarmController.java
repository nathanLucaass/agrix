package com.betrybe.agrix.controller;

import com.betrybe.agrix.dto.CropDto;
import com.betrybe.agrix.dto.FarmCreationDto;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.service.CropService;
import com.betrybe.agrix.service.FarmServiceInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  private final CropService cropService;

  /**
   * Instantiates a new Farm controller.
   *
   * @param farmService the farm service
   * @param cropService the crop service
   */
  @Autowired
  public FarmController(FarmServiceInterface farmService, CropService cropService) {
    this.farmService = farmService;
    this.cropService = cropService;
  }

  /**
   * Post new farm response entity.
   *
   * @param farm the farm
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<FarmCreationDto> postNewFarm(@RequestBody Farm farm) {
    Farm createdFarm = farmService.createFarm(farm);

    return ResponseEntity.status(HttpStatus.CREATED).body(FarmCreationDto.farmToFarm(farm));
  }

  /**
   * Gets all farms.
   *
   * @return the all farms
   */
  @GetMapping
  public ResponseEntity<List<FarmCreationDto>> getAllFarms() {
    List<Farm> farms = farmService.getFarms();
    List<FarmCreationDto> farmDtos = new ArrayList<>();

    for (Farm farm : farms) {
      farmDtos.add(FarmCreationDto.farmToFarm(farm));
    }

    return ResponseEntity.status(HttpStatus.OK).body(farmDtos);
  }


  /**
   * Gets farm by id.
   *
   * @param id the id
   * @return the farm by id
   */
  @GetMapping("/{id}")
  public ResponseEntity<FarmCreationDto> getFarmById(@PathVariable Long id) {

    Farm farm = farmService.getFarmById(id);

    return ResponseEntity.status(HttpStatus.OK).body(FarmCreationDto.farmToFarm(farm));
  }

  /**
   * Post crop response entity.
   *
   * @param id   the id
   * @param crop the crop
   * @return the response entity
   */
  @PostMapping("{id}/crops")
  public ResponseEntity<CropDto> postCrop(@PathVariable Long id, @RequestBody Crop crop) {
    Crop newCrop = cropService.createCrop(id, crop);

    return ResponseEntity.status(HttpStatus.CREATED).body(CropDto.cropToDto(newCrop));
  }

  /**
   * Gets farm crops.
   *
   * @param farmId the farm id
   * @return the farm crops
   */
  @GetMapping("{farmId}/crops")
  public ResponseEntity<List<CropDto>> getFarmCrops(@PathVariable Long farmId) {
    List<Crop> crops = cropService.getFarmCrops(farmId);
    List<CropDto> cropDtos = new ArrayList<>();

    for (Crop crop : crops) {
      CropDto cropDto = CropDto.cropToDto(crop);
      cropDtos.add(cropDto);
    }

    return ResponseEntity.status(HttpStatus.OK).body(cropDtos);
  }

}
