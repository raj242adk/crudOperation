package com.crud.crudoperation.repository;

import com.crud.crudoperation.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,String> {
}
