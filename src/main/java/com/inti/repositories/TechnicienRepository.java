package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Technicien;

@Repository
public interface TechnicienRepository extends JpaRepository<Technicien, Integer> {

}