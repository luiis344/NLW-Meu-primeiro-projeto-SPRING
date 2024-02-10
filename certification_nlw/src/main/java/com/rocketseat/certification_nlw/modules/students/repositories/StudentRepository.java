package com.rocketseat.certification_nlw.modules.students.repositories;

import com.rocketseat.certification_nlw.modules.students.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {

    public static Optional<StudentEntity> findByEmail(String email) {
        return Optional.empty();
    }
}
