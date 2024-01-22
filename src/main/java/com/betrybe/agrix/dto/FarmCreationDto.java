package com.betrybe.agrix.dto;

/**
 * The type Farm creation dto.
 */
public record FarmCreationDto(
    Long id,
    String name,
    Double size,
    Long farmId) {
}
