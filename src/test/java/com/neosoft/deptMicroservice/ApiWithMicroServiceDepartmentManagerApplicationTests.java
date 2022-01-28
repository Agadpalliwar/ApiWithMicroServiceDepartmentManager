package com.neosoft.deptMicroservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neosoft.deptMicroservice.model.Department;
import com.neosoft.deptMicroservice.repository.DepartmentRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class ApiWithMicroServiceDepartmentManagerApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	DepartmentRepository deptRepo;
	
	@Test
	public void testCreateDepartment()
	{
		Department dept = deptRepo.save(new Department(104,"akash","mumbai","akash","akash"));
		assertThat(dept.getDeptId()).isGreaterThan(0);
	}
	
	@Test
	public void testListDepartmnt()
	{
		List<Department> depts = deptRepo.findAll();
		assertThat(depts).size().isGreaterThan(0);
	}

}
