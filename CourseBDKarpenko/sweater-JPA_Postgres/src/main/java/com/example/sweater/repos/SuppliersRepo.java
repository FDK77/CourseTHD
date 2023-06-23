package com.example.sweater.repos;

import com.example.sweater.domain.Sale;
import com.example.sweater.domain.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliersRepo extends JpaRepository<Suppliers, Integer> {
}
