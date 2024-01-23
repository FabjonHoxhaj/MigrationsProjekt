package com.datamigration.MigrationsProjekt.repository;

import com.datamigration.MigrationsProjekt.entity.MigrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MigrationRepository extends JpaRepository<MigrationEntity, Integer> {
}
