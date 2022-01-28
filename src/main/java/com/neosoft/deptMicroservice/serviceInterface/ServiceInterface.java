package com.neosoft.deptMicroservice.serviceInterface;

import java.util.List;

import com.neosoft.deptMicroservice.model.Department;

public interface ServiceInterface {

	Department saveDepartment(Department department);

	Department findDepartmentById(int departmentId);

	List<Department> getAllDepartment();

	void deleteDepartment(int deptId);

	Department updateDepartment(Department dept, int deptId);

}
