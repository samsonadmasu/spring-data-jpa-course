package com.example.demo.RelationController;

import com.example.demo.RelationRepository.StudenttRepository;
import com.example.demo.Relationmodel.Studentt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    private final StudenttRepository studenttRepository;

    public studentController(StudenttRepository studenttRepository) {
        this.studenttRepository = studenttRepository;
    }


    @GetMapping
    public List<Studentt> getStudents(){
       return studenttRepository.findAll();
    }

    @PostMapping
    public Studentt createStudent(@RequestBody Studentt studentt){
        return studenttRepository.save(studentt);
    }
}
