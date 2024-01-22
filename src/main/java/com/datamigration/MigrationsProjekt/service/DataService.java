package com.datamigration.MigrationsProjekt.service;

import com.datamigration.MigrationsProjekt.entity.DataEntity;
import com.datamigration.MigrationsProjekt.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private final DataRepository datarepo;

    @Autowired
    public DataService(DataRepository datarepo) {
        this.datarepo = datarepo;
    }

    public DataEntity getById(int id) {
        DataEntity dataEntity = datarepo.findById(id).orElse(null);
        return dataEntity;
    }

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
