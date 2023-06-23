package com.example.sweater.controllers;

import com.example.sweater.domain.Supply_invoice;
import com.example.sweater.repos.SupplyInvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
public class SupplyInvoiceController {
    @Autowired
    private SupplyInvoiceRepo supplyInvoiceRepo;


    @GetMapping("/supinv")
    public String main(Map<String, Object> model) {
        Iterable<Supply_invoice> supinv = supplyInvoiceRepo.findAll();
        model.put("supinv", supinv);
        return "supinv";
    }

    @PostMapping("/filtersupinv")
    public String filter(@RequestParam(required = false) Integer id, Map<String, Object> model) {
        List<Supply_invoice> allsupply;
        List<Supply_invoice> supplybyid = new ArrayList<>();
        Integer currentid;
        allsupply = supplyInvoiceRepo.findAll();
        if (id != null) {
            for (Supply_invoice supinv : allsupply) {
                currentid = supinv.getSupply_invoice_id();
                if (currentid.equals(id)) {
                    supplybyid.add(supinv);
                }
            }
            model.put("supinv", supplybyid);
        } else {
            model.put("supinv", allsupply);
        }
        return "supinv";

    }}

