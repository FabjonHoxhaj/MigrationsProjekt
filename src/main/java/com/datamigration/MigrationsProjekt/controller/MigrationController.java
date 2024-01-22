package com.datamigration.MigrationsProjekt.controller;

import java.util.Collections;
import java.util.List;

import com.datamigration.MigrationsProjekt.entity.DataEntity;
import com.datamigration.MigrationsProjekt.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MigrationController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public List<DataEntity> getAll() {
        if (this.dataService != null) {
            return dataService.getAll();
        } else {
            System.out.println("Nichts drinne");
            return Collections.emptyList();
        }
    }

    @PostMapping
    public boolean create(@RequestBody DataEntity course) {
        if (this.dataService != null) {
            return dataService.create(course);
        }
        else {
            return false;
        }
    }
}
