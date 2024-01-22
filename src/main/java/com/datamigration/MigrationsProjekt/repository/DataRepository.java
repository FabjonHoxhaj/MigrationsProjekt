package com.datamigration.MigrationsProjekt.repository;

import com.datamigration.MigrationsProjekt.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Integer> {
}
