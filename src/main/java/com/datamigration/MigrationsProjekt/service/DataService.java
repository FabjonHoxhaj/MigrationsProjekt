package com.datamigration.MigrationsProjekt.service;

import com.datamigration.MigrationsProjekt.entity.DataEntity;
import com.datamigration.MigrationsProjekt.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository datarepo;

    public List<DataEntity> getAll() {
        List<DataEntity> dataEntities = datarepo.findAll();
        return dataEntities;
    }

    public boolean create(DataEntity course) {
        // INSERT INTO course (name, duration) values ('BTech', 4);
        datarepo.save(course);
        return true;
    }


}
