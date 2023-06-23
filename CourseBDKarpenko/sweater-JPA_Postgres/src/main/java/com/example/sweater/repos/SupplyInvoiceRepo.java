package com.example.sweater.repos;

import com.example.sweater.domain.Sale;
import com.example.sweater.domain.Supply_invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyInvoiceRepo extends JpaRepository<Supply_invoice, Integer> {
}
