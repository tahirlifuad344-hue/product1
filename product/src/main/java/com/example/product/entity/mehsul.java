package com.example.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mehsul")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class mehsul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
   private String name;
    @Column(nullable = false)
   private Long price;
    @Column(nullable = false)
   private Long productionDate;
    @Column(nullable = false)
   private Long lastUseDate;


    @ManyToOne
    @JoinColumn(name = "category_id")
   private category category;
    @Column(nullable = false)
    private Long sellingPrice;

}
