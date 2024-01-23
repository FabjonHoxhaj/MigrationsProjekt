package com.datamigration.MigrationsProjekt.controller;

import com.datamigration.MigrationsProjekt.service.MigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.datamigration.MigrationsProjekt.entity.MigrationEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class MigrationIndexController {

    @Autowired
    private MigrationService dataService;

    @GetMapping("/get")
    public String getAllData(Model model) {
        List<MigrationEntity> daten = dataService.getAll();
        model.addAttribute("daten", daten);
        return "index";
    }

    @PostMapping("/insert")
    public boolean create(@RequestBody MigrationEntity entry) {
        if (this.dataService != null) {
            dataService.create(entry);
            return true;
        }
        else {
            return false;
        }
    }
}
