package com.example.PrescriptionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PrescriptionSystem.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
