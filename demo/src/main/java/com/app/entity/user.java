package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@Column(name="user_name",nullable=false,length=50)
private String name;
	@Column(name="Email",nullable=false,length=30)
private String email;
	@Column(name="Password",nullable=false,length=10)
private String password;
	@Column(name="About",nullable=false,length=100)
private String about;
}
