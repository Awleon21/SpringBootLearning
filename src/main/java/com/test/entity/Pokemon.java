package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pokemon {
    @Column(name = "Name")
    private String Name;
    @Column(name = "Attack")
    private int Attack;
    @Column(name = "Health")
    private  float Health;
    @Column(name = "Description")
    private String Description;
    @Column(name = "TotalWins")
    private int Totalwins;
    @Column(name = "TotalLosses")
    private int TotalLosses;
    @Column(name = "Level")
    private int Level;

}
