package com.example.sweater.controllers;

import com.example.sweater.domain.Sale;
import com.example.sweater.repos.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;

@Controller
public class SaleController {
    @Autowired
    private SaleRepo saleRepo;


    @GetMapping("/sale")
    public String main(Map<String, Object> model) {
        Iterable<Sale> sales = saleRepo.findAll();
        model.put("sales", sales);
        return "sale";
    }

    @GetMapping("/sale/delete")
    public String deleteSale(@RequestParam("id") Integer saleId) {
        saleRepo.deleteById(saleId);
        return "redirect:/sale";
    }

    @GetMapping("/sale/edit")
    public String editSale(@RequestParam("id") Integer saleId, Map<String, Object> model) {
        Optional<Sale> saleOptional = saleRepo.findById(saleId);
        if (saleOptional.isPresent()) {
            Sale sale = saleOptional.get();
            model.put("sale", sale);
            return "edit-sale";
        }
        return "redirect:/sale";
    }

    @PostMapping("/sale/update")
    public String updateSale(@ModelAttribute("sale") @DateTimeFormat(pattern = "yyyy-MM-dd") Sale sale) {
        saleRepo.save(sale);
        return "redirect:/sale";
    }

}
