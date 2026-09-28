package com.example.springbootcoursedemo.dto;

import lombok.Builder;

@Builder
public record CategoryResponse(Long categoryId, String name, String description) {
}
