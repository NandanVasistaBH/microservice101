package com.ndn.dept_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ndn.dept_service.model.Department;
import com.ndn.dept_service.repositry.DepartmentRepositry;
@RestController
public class DepartmentController {
     @Autowired
    DepartmentRepositry departmentRepositry;
    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("Hello world",HttpStatus.OK);
    }
    @GetMapping("department")
    public ResponseEntity<String> getDeptarment(@RequestParam Integer department_id){

        Optional<Department> resp = departmentRepositry.findById(department_id);
        return new ResponseEntity<String>(resp.toString(),HttpStatus.OK);
    }
    @PostMapping("department")
    public ResponseEntity<String> addDepartment(@RequestBody Department department){
        Department resp = departmentRepositry.save(department);
        return new ResponseEntity<String>(resp.toString(),HttpStatus.OK);

    }
}
