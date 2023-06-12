package com.app.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Hospitaliytdto {
	
	
		
		
	private int id;
		
		
	private String name;
		
	private String frequency;
		
	private String precausitions;

}
