package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.RecruitmentBean;

public interface RecruitmentRepository extends JpaRepository<RecruitmentBean, Long>{

}
