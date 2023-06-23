package com.example.sweater.controllers;

import com.example.sweater.domain.Staff;
import com.example.sweater.repos.CascadeStaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class CascadeStaffController {
    @Autowired
    private CascadeStaffRepo staffRepo;


    @GetMapping("/cascadeStaff")
    public String main(Map<String, Object> model) {
        Iterable<Staff> cascadeStaff = staffRepo.findAll();
        model.put("cascadeStaff", cascadeStaff);
        return "cascadeStaff";
    }

    @PostMapping("/filter")
    public String filter(@RequestParam(required = false) Integer id, Map<String, Object> model) {
        List<Staff> allstaff;
        List<Staff> staffbyid = new ArrayList<>();
        Integer currentid;
        allstaff = staffRepo.findAll();
        if (id != null) {
            for (Staff staff : allstaff) {
                currentid = staff.getService_number();
                if (currentid.equals(id)) {
                    staffbyid.add(staff);
                }
            }
            model.put("cascadeStaff", staffbyid);
        } else {
            model.put("cascadeStaff", allstaff);
        }
        return "cascadeStaff";

    }}
