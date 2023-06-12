package com.app.service;

import java.util.List;

import com.app.model.Medicine;

public interface MedicineService {
    void addMedicine(Medicine medicine);
    List<Medicine> getAllMedicines();
    Medicine getMedicineById(Long id);
    void updateMedicine(Medicine medicine);
    void deleteMedicine(Long id);
}

