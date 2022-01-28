package com.neosoft.deptMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.deptMicroservice.model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer>{

	Department findByDeptId(int departmentId);

}
