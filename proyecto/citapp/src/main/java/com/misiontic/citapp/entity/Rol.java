package com.misiontic.citapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@Column(name="idrol", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;
	
	@Column(name="nombrerol", nullable = false, length = 100)
	private String nombreRol;
	
	public Rol() {
		
	}

}
