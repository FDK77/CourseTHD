package com.example.sweater.controllers;

import com.example.sweater.domain.Suppliers;
import com.example.sweater.repos.SuppliersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;
@Controller
public class SuppliersController {
    @Autowired
    private SuppliersRepo suppliersRepo;


    @GetMapping("/suppliers")
    public String main(Map<String, Object> model) {
        Iterable<Suppliers> suppliers = suppliersRepo.findAll();
        model.put("suppliers", suppliers);
        return "suppliers";
    }

    @GetMapping("/suppliers/delete")
    public String deleteSale(@RequestParam("id") Integer supplierId) {
        suppliersRepo.deleteById(supplierId);
        return "redirect:/suppliers";
    }

    @GetMapping("/suppliers/edit")
    public String editSale(@RequestParam("id") Integer supplierId, Map<String, Object> model) {
        Optional<Suppliers> suppliersOptional = suppliersRepo.findById(supplierId);
        if (suppliersOptional.isPresent()) {
            Suppliers suppliers = suppliersOptional.get();
            model.put("suppliers", suppliers);
            return "edit-suppliers";
        }
        return "redirect:/suppliers";
    }

    @PostMapping("/suppliers/update")
    public String updateSuppliers(@ModelAttribute("suppliers") Suppliers suppliers) {
        suppliersRepo.save(suppliers);
        return "redirect:/suppliers";
    }

    @GetMapping("/suppliers/create")
    public String createSupplierForm(Map<String, Object> model) {
        Suppliers supplier = new Suppliers(); // Создаем новый объект Suppliers
        model.put("supplier", supplier); // Передаем его в модель
        return "create-supplier"; // Возвращаем имя шаблона для отображения формы создания поставщика
    }

    @PostMapping("/suppliers/save")
    public String saveSupplier(@ModelAttribute("supplier") Suppliers supplier) {
        suppliersRepo.save(supplier); // Сохраняем нового поставщика в базу данных
        return "redirect:/suppliers"; // Перенаправляем на страницу со списком поставщиков
    }
}
