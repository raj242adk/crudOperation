package com.crud.crudoperation.controller;


import com.crud.crudoperation.entity.Subject;
import com.crud.crudoperation.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    //creates the methods to do crud operation in the database


    @RequestMapping("/getallsubject")
    public List<Subject> getAllSubject(){

       return subjectService.getAllSubjects();
    }


    @RequestMapping(method = RequestMethod.POST,value ="/getallsubject")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

//To update
    @RequestMapping(method=RequestMethod.PUT,value = "/getallsubject/{id}")

    public void updateSubject(@PathVariable String id,@RequestBody Subject subject){
        subjectService.updateSubject(id,subject);
    }

    @RequestMapping(method=RequestMethod.DELETE,value = "/getallsubject/{id}")
    public void deleteSubject(@PathVariable String id){
        subjectService.deleteSubject(id);
    }

}
