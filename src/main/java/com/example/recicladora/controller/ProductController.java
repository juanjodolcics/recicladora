package com.example.recicladora.controller;

import com.example.recicladora.model.Product;
import com.example.recicladora.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    Flux<Product> all() { return repo.findAll(); }

    @GetMapping("/{id}")
    Mono<Product> one(@PathVariable Long id) { return repo.findById(id); }

    @PostMapping
    Mono<Product> create(@RequestBody Product p) { return repo.save(p); }
}
