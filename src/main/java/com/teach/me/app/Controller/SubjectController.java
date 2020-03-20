package com.teach.me.app.Controller;

import com.teach.me.app.Exception.SubjectNotFoundException;
import com.teach.me.app.Model.Subject;
import com.teach.me.app.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/subject")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/insert")
    private ResponseEntity insertSubject(@RequestBody Subject subject) {
        System.out.println("Inside SubjectController: " + subject.toString());
        Subject createdSub = subjectService.insertSubject(subject);
        return ResponseEntity.ok().body(createdSub);
    }

    @GetMapping("/all")
    private List<Subject> getAllSubjects() {
        List<Subject> subjectList = new ArrayList<Subject>();
        subjectList = subjectService.getAllSubjects();
        return subjectList;
    }

    @GetMapping("/{subjectId}")
    private Subject getSubjectById(@PathVariable int subjectId) throws SubjectNotFoundException {
        return subjectService.getSubjectById(subjectId);
    }


}
