package com.shirsho.crudprojectusingdb.controller;

import com.shirsho.crudprojectusingdb.model.StudentDto;
import com.shirsho.crudprojectusingdb.model.dao.Student;
import com.shirsho.crudprojectusingdb.service.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentsController {
    private final StudentRepository studentRepository;

    @PostMapping("/students")
    public void postStudent(@RequestBody StudentDto studentDto) {
        Student student=new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setYear(studentDto.getYear());
        studentRepository.save(student);
    }
}
