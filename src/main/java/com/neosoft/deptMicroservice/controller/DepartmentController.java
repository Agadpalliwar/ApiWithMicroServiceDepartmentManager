package com.neosoft.deptMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.deptMicroservice.model.Department;
import com.neosoft.deptMicroservice.serviceInterface.ServiceInterface;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	
	@PostMapping("/saveDepartment")
	public ResponseEntity<?> saveDepartme(@RequestBody Department dept)
	{		
		if(dept!=null)
		{
			serviceInterface.saveDepartment(dept);	
		return new ResponseEntity<String>("department saved successfully",HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<String>("department not saved please try again",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllDepartment")
	public ResponseEntity<?> getAllDepartment()
	{
		List<Department> list=serviceInterface.getAllDepartment();
		if(list!=null)
		{
		return new ResponseEntity<List<Department>>(list,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<List<Department>>(list,HttpStatus.NOT_FOUND);
		}
	}

	
	
	
	@DeleteMapping("/deleteDepartment/{deptId}")
	public ResponseEntity<?> DeleteUserById(@PathVariable("deptId") int deptId) {		
				if(deptId==0)
				{
				 serviceInterface.deleteDepartment(deptId);
				return new ResponseEntity<Department>(HttpStatus.FOUND);	
				}
				else
				{
					return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);	
				}
	
	}
	
	
	@PutMapping("/updateDepartment/{deptId}")
	public ResponseEntity<?> UpdateUserById(@RequestBody Department dept, @PathVariable("deptId") int deptId) {
	
			if (dept != null) {

				Department updateDept = serviceInterface.updateDepartment(dept, deptId);
				return new ResponseEntity<Department>(updateDept, HttpStatus.CREATED);
			} else {

				return new ResponseEntity<Department>(HttpStatus.NOT_MODIFIED);
			}
		
	
	}

	    @GetMapping("/getDepartment/{deptId}")
	    public ResponseEntity<?> findDepartmentById(@PathVariable("deptId") int departmentId) {
	       
	        Department dept=serviceInterface.findDepartmentById(departmentId);
	        if(dept!=null)
	        {
	        return new ResponseEntity<Department>(dept,HttpStatus.FOUND);
	        }
	        else
	        {
	        	 return new ResponseEntity<Department>(dept,HttpStatus.NOT_FOUND);
	        }
	    }

}
