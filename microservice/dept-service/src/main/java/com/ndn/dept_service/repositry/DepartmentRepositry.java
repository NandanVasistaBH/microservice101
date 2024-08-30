package com.ndn.dept_service.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndn.dept_service.model.Department;

public interface DepartmentRepositry  extends JpaRepository<Department, Integer >{
    
    
}
