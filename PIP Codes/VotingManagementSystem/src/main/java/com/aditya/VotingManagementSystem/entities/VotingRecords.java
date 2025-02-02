package com.aditya.VotingManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
public class VotingRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int votingRecordsId;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Voter voter;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Party party;
}
