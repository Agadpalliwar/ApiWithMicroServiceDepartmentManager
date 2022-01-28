//package com.neosoft.deptMicroservice.Service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//import com.neosoft.deptMicroservice.MongoApplicationTests;
//import com.neosoft.deptMicroservice.model.Department;
//import com.neosoft.deptMicroservice.repository.DepartmentRepository;
//import com.neosoft.deptMicroservice.servicreImple.DepartmentServiceImpl;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.util.List;
//
//public class UserServiceTests extends MongoApplicationTests {
//
//    @InjectMocks
//    @Autowired
//    DepartmentServiceImpl userService;
//
//    @Autowired
//    DepartmentRepository userRepository;
//
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//        saveUser();
//    }
//
//    public void saveUser() {
//    	 String user = "{\n" +
//        		 "\t\"deptId\" : \"104\",\n" +
//                "\t\"deptName\" : \"Info technology\",\n" +
//                "\t\"deptAddress\" : \"pune\",\n" +
//                "\t\"deptPassword\": \"IT\",\n" +
//                "\t\"deptUsername\" : \"IT\"\n" +
//                "}";
//
//
//        try {
//            Department users = new ObjectMapper().readValue(user, Department.class);
//                userRepository.save(users);
//            
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Test
//    public void saveTest() throws Exception{
//    	
//    	
//        String user = "{\n" +
//        		 "\t\"deptId\" : \"104\",\n" +
//                "\t\"deptName\" : \"Info technology\",\n" +
//                "\t\"deptAddress\" : \"pune\",\n" +
//                "\t\"deptPassword\": \"IT\",\n" +
//                "\t\"deptUsername\" : \"IT\"\n" +
//                "}";
//
//        Department users= new ObjectMapper().readValue(user, Department.class);
//        userService.saveDepartment(users);
//
//        Assert.assertEquals(3, userService.getAllDepartment().size());
//
//    }
//
//    @Test
//    public void searchTest() {
//        List<Department> users = userService.getAllDepartment();
//
//        Assert.assertTrue("Bhanuka".equals(users.get(0).getDeptName()));
//
//    }
//
//
//}