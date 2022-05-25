package com.example.demo.RelationController;

import com.example.demo.RelationRepository.StudenttRepository;
import com.example.demo.RelationRepository.SubjectRepository;
import com.example.demo.RelationRepository.TeacherRepository;
import com.example.demo.Relationmodel.Studentt;
import com.example.demo.Relationmodel.Subject;
import com.example.demo.Relationmodel.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectRepository subjectRepository;
    private final StudenttRepository studenttRepository;
    private final TeacherRepository teacherRepository;
    public SubjectController(SubjectRepository subjectRepository, StudenttRepository studenttRepository, TeacherRepository teacherRepository) {
        this.subjectRepository = subjectRepository;
        this.studenttRepository = studenttRepository;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject){
        return subjectRepository.save(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject enrollStudentToSubject(
        @PathVariable Long subjectId,
        @PathVariable Long studentId
    ){
        Subject subject = subjectRepository.findById(subjectId).get();
        Studentt studentt = studenttRepository.findById(studentId).get();
        subject.enrollStudent(studentt);
        return subjectRepository.save(subject);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    Subject teacherToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long teacherId
    ){
        Subject subject = subjectRepository.findById(subjectId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();
        subject.assignTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
