package com.neosoft.deptMicroservice.servicreImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.deptMicroservice.model.Department;
import com.neosoft.deptMicroservice.repository.DepartmentRepository;
import com.neosoft.deptMicroservice.serviceInterface.ServiceInterface;

@Service
public class DepartmentServiceImpl implements ServiceInterface{

	
	@Autowired
	private DepartmentRepository deptRepository;
	@Override
	public Department saveDepartment(Department department) {
		Department dept=deptRepository.save(department);
		return dept;
	}

	@Override
	public Department findDepartmentById(int departmentId) {
		Department dept=deptRepository.findByDeptId(departmentId);
		return dept;
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> list=deptRepository.findAll();
		return list;
	}

	@Override
	public void deleteDepartment(int deptId) {
		deptRepository.deleteById(deptId);
		
	}

	@Override
	public Department updateDepartment(Department dept, int deptId) {
		Department updatedDept=deptRepository.save(dept);
		return updatedDept;
	}
	
}
