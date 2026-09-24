package com.example.recicladora.model;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
public record Product(@Id Long id, String name, BigDecimal price) {}
