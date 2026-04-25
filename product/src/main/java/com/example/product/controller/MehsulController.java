package com.example.product.controller;

import com.example.product.entity.Mehsul;
import com.example.product.service.MehsulService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mehsul")
public class MehsulController {
    private final MehsulService mehsulService;
    public MehsulController(MehsulService mehsulService) {
        this.mehsulService = mehsulService;
    }

    @PostMapping
    public ResponseEntity<Mehsul> create(@RequestBody Mehsul mehsul) {
        return ResponseEntity.ok(mehsulService.createMehsul(mehsul));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mehsul> getMehsulById(@PathVariable Long id) {
        return ResponseEntity.ok(mehsulService.getMehsulById(id));
    }
    @GetMapping
    public ResponseEntity<List<Mehsul>> getAllMehsul() {
        return ResponseEntity.ok(mehsulService.getAllMehsul());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Mehsul> updateMehsul(@PathVariable Long id, @RequestBody Mehsul mehsulDetails) {
        return ResponseEntity.ok(mehsulService.updateMehsul(id, mehsulDetails));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Mehsul> delete(@PathVariable Long id) {
        mehsulService.deleteMehsul(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/sellingPriceBetween/{min}/{max}")
    public ResponseEntity<List<Mehsul>> findBySellingPriceBetween(@PathVariable Long min, @PathVariable Long max) {
        return ResponseEntity.ok(mehsulService.findBySellingPriceBetween(min, max));
    }
    @GetMapping("/lastUseDateBefore")
    public ResponseEntity<List<Mehsul>> findByLastUseDateBefore() {
        return ResponseEntity.ok(mehsulService.findByLastUseDateBefore());
    }
}
