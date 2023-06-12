package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // Additional custom queries as needed
}

