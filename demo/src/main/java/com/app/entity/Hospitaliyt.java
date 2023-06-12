package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Hospitaliyt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
	@Column(name="Tablet_name",nullable=false,length=50)
private String name;
	@Column(name="Tablet_frequency",nullable=false,length=50)
private String frequency;
	@Column(name="Tablet_precausitions",nullable=false,length=100)
private String precausitions;

}
