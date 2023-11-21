package com.example.PrescriptionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PrescriptionSystem.entity.*;

public interface PrescriptionRepository extends JpaRepository<Prescription,Long>{

}
