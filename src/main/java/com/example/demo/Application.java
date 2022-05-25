package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application{
private final StudentRepository studentRepository;

    public Application(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//           Student samson = new Student("sam","adm","samson@gmail.com",33);
//           Student sam = new Student("sam","adm","sam@gmail.com",33);
//            studentRepository.saveAll(List.of(samson,sam));
//        };
//    }

//    @Override
//    public void run(String... args) throws Exception {
//        Student student = new Student();
//        student.setFirstName("samson");
//        student.setLastName("admasu");
//        student.setEmail("samsonadmasu9@gmail.com");
//        student.setAge(32);
//        studentRepository.save(student);
//    }
}
