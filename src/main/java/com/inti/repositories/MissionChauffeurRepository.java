package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.MissionChauffeur;

@Repository
public interface MissionChauffeurRepository extends JpaRepository<MissionChauffeur, Integer> {

}
