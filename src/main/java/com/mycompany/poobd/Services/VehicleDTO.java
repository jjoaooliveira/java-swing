package com.mycompany.poobd.Services;

import java.util.Optional;

public record VehicleDTO(Optional<Integer> id, String model, String color, String year) {
}
