package com.shirsho.crudprojectusingdb.controller;

import com.shirsho.crudprojectusingdb.service.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentsController {
    private final StudentRepository studentRepository;
}
