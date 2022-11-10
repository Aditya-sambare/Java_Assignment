package com.aditya.VotingManagementSystem.repository;

import com.aditya.VotingManagementSystem.entities.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter,Integer> {
}
