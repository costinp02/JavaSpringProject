package com.techie.microservices.product.rest.dto;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}
