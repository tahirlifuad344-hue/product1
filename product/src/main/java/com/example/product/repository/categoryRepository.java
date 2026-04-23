package com.example.product.repository;

import com.example.product.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository<category, Long> {

}
