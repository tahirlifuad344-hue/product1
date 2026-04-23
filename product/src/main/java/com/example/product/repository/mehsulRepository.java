package com.example.product.repository;

import com.example.product.entity.category;
import com.example.product.entity.mehsul;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface mehsulRepository extends JpaRepository<mehsul, Long> {
 List<mehsul> findByLastUseDate(Long lastUseDate);
List<mehsul> findByCategory(category category);
List<mehsul> findByPriceBetween(Long min,Long max);
boolean existsByName(String name);
}
