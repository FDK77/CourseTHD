package com.example.sweater.repos;

import com.example.sweater.domain.Client;
import com.example.sweater.domain.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Integer> {
}
