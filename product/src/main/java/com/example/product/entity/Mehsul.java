package com.example.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="mehsul")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mehsul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
   private String name;
    @Column(nullable = false)
   private Long costPrice;
    @Column(nullable = false)
   private LocalDate productionDate;
    @Column(nullable = false)
   private LocalDate  lastUseDate;


    @ManyToOne
    @JoinColumn(name = "category_id")
   private Category category;
    @Column(nullable = false)
    private Long sellingPrice;

}
