package com.example.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.EmployeeDAO;
import com.example.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;
	

	/* to save an employee */
	@PostMapping("/employees")
	@CrossOrigin(origins="http://localhost:4200")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeDAO.save(emp);
	}
	

	/* get all employees */
	@GetMapping("/employees")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Employee> getAllEmployees() {
		return employeeDAO.findAll();
	}
	
	/* Update employees */
	 @DeleteMapping("/delete/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
		public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long empid) {

			Employee emp = employeeDAO.findOne(empid);
			if (emp == null) {
				return ResponseEntity.notFound().build();
			}
			employeeDAO.delete(emp);

			return ResponseEntity.ok().build();

		}

	/*
	 * @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	 * // @CrossOrigin(origins = "http://localhost:4200") public
	 * ResponseEntity<Employee> updateUser(@PathVariable("id") long id, @RequestBody
	 * Employee user) {
	 * 
	 * Employee currentUser = employeeDAO.findOne(id);
	 * currentUser.setCname(user.getCname()); currentUser.setCctc(user.getCctc());
	 * currentUser.setContactNo(user.getContactNo());
	 * currentUser.setCurrentOrg(user.getCurrentOrg());
	 * currentUser.setDate(user.getDate()); currentUser.setEmail(user.getEmail());
	 * currentUser.setGender(user.getGender()); //currentUser.setId(user.getId());
	 * currentUser.setInterviewPannel(user.getInterviewPannel());
	 * currentUser.setLocation(user.getLocation());
	 * currentUser.setNoticePeriod(user.getNoticePeriod());
	 * currentUser.setReleventExp(user.getReleventExp());
	 * currentUser.setRelocate(user.getRelocate());
	 * currentUser.setStack(user.getStack());
	 * currentUser.setTotalExp(user.getTotalExp()); employeeDAO.save(currentUser);
	 * return new ResponseEntity<Employee>(currentUser, HttpStatus.OK); }
	 */
	 @PutMapping("/update/{id}")
	 @CrossOrigin(origins = "http://localhost:4200")
	    public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody Employee user){
		  Employee emp=employeeDAO.findOne(empid);
		  if(emp==null)
		  { String s1="Employee with this ID not found";
		  return ResponseEntity.notFound().build();
		  }
		  emp.setCname(user.getCname());
		  emp.setCctc(user.getCctc());
		  emp.setContactNo(user.getContactNo());
		  emp.setCurrentOrg(user.getCurrentOrg());
		  emp.setDate(user.getDate()); 
		  emp.setEmail(user.getEmail());
		  emp.setGender(user.getGender()); //currentUser.setId(user.getId());
		  emp.setInterviewPannel(user.getInterviewPannel());
		  emp.setLocation(user.getLocation());
		  emp.setNoticePeriod(user.getNoticePeriod());
		  emp.setReleventExp(user.getReleventExp());
		  emp.setRelocate(user.getRelocate());
		  emp.setStack(user.getStack());
		  emp.setTotalExp(user.getTotalExp());
		  //emp.setId(user.getId());
		  
		  Employee updateEmployee=employeeDAO.save(emp); 
		  return ResponseEntity.ok().body(updateEmployee);
		  
		  }
}
