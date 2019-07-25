package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.RecruitmentDAO;
import com.example.model.Employee;
import com.example.model.RecruitmentBean;

@RestController
@RequestMapping("/requirement")
public class RecruitmentController {
    @Autowired
	RecruitmentDAO recruitDao;
    
    @PostMapping("/recruit")
    @CrossOrigin(origins="http://localhost:4200")
    public RecruitmentBean addRecruitInfo(@Valid @RequestBody RecruitmentBean bean) {
		return recruitDao.save(bean);
    	
    }
    @GetMapping("/getall")
	@CrossOrigin(origins="http://localhost:4200")
	public List<RecruitmentBean> getAllEmployees() {
		return recruitDao.findAll();
	}
    
    @DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<RecruitmentBean> deleteEmployee(@PathVariable(value = "id") Long empid) {

    	RecruitmentBean emp = recruitDao.findOne(empid);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		recruitDao.delete(emp);

		return ResponseEntity.ok().build();

	}
   
    @PutMapping("/update/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<RecruitmentBean> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody RecruitmentBean user){
    	RecruitmentBean emp=recruitDao.findOne(empid);
	  if(emp==null)
	  { String s1="Employee with this ID not found";
	      return ResponseEntity.notFound().build();
	  }
	 // emp.setCname(user.getCname());
	  emp.setClientName(user.getClientName());
	  emp.setDate(user.getDate());
	  emp.setExpReq(user.getExpReq());
	  emp.setJobDesc(user.getJobDesc());
	  emp.setLocation(user.getLocation());
	  emp.setNoPosition(user.getNoPosition());
	  emp.setStack(user.getStack());
	  
	  RecruitmentBean updateEmployee=recruitDao.save(emp); 
	  return ResponseEntity.ok().body(updateEmployee);
	  
	  }
}
