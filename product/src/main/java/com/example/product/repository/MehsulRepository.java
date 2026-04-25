package com.example.product.repository;

import com.example.product.entity.Mehsul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MehsulRepository extends JpaRepository<Mehsul,Long> {
    List<Mehsul> findBySellingPriceBetween(Long min, Long max);
    List<Mehsul> findByLastUseDateBefore(LocalDate currentDate);
}
