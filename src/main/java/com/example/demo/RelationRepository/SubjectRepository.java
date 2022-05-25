package com.example.demo.RelationRepository;

import com.example.demo.Relationmodel.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
