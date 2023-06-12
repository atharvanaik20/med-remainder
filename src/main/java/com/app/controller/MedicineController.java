package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Medicine;
import com.app.service.MedicineService;


@Controller
@RequestMapping("/medicine")
public class MedicineController {

    private final MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @GetMapping("/add")
    public String showAddMedicineForm(Model model) {
        model.addAttribute("medicine", new Medicine());
        return "add-medication";
    }

    @PostMapping("/add")
    public String addMedicine(Medicine medicine) {
        medicineService.addMedicine(medicine);
        return "redirect:/medicine/view-reminders";
    }

    @GetMapping("/view-reminders")
    public String viewReminders(Model model) {
        model.addAttribute("medicines", medicineService.getAllMedicines());
        return "view-reminders";
    }

    @GetMapping
    public String showMedicinePage() {
        return "medicine";
    }

}


