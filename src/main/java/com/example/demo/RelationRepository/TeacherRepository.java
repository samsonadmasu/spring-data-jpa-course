package com.example.demo.RelationRepository;

import com.example.demo.Relationmodel.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
