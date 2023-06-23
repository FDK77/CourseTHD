package com.example.sweater.repos;

import com.example.sweater.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CascadeStaffRepo extends JpaRepository<Staff, Integer> {
}
