package com.datamigration.MigrationsProjekt.service;

import com.datamigration.MigrationsProjekt.entity.MigrationEntity;
import com.datamigration.MigrationsProjekt.repository.MigrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MigrationService {

    @Autowired
    private MigrationRepository datarepo;

    public List<MigrationEntity> getAll() {
        List<MigrationEntity> dataEntities = datarepo.findAll();
        return dataEntities;
    }

    public boolean create(MigrationEntity course) {
        // INSERT INTO course (name, duration) values ('BTech', 4);
        datarepo.save(course);
        return true;
    }


}
