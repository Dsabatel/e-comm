package com.telusko.springecom.model.dto;

public record OrderItemRequest(
        Integer productId,
        Integer quantity
) {}
