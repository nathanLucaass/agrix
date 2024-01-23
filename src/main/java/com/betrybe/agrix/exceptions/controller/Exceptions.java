package com.betrybe.agrix.exceptions.controller;

import com.betrybe.agrix.exceptions.CropNotFoundException;
import com.betrybe.agrix.exceptions.FarmNotFoundException;
import java.security.cert.CRLException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The type Exceptions.
 */
@ControllerAdvice
public class Exceptions {

  /**
   * Farm not found response entity.
   *
   * @return the response entity
   */
  @ExceptionHandler(FarmNotFoundException.class)
  public ResponseEntity<String> farmNotFound() {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fazenda não encontrada!");
  }

  @ExceptionHandler(CropNotFoundException.class)
  public ResponseEntity<String> cropNotFound() {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
  }

}
