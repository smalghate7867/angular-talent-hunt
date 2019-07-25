package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.model.RecruitmentBean;
import com.example.respository.RecruitmentRepository;

@Service
public class RecruitmentDAO {
	@Autowired
	RecruitmentRepository recruitEmpRepo;

	
	public RecruitmentBean save(RecruitmentBean emp) {
		return recruitEmpRepo.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<RecruitmentBean> findAll(){
		return recruitEmpRepo.findAll();
	}
	
	
	/*get an employee by id*/
	public RecruitmentBean findOne(Long empid) {
		return recruitEmpRepo.getOne(empid);
	}
	
	
	/*delete an employee*/
	
	public void delete(RecruitmentBean emp) {
		recruitEmpRepo.delete(emp);
	}
}
