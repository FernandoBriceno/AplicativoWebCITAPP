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
@Table(name="medicos")
public class Medico {
	
	@Id
	@Column(name="idmedico", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedico;
	
	@Column(name="idusuario", nullable=false)
	private Long idUsuario;
	
	@Column(name="especialidad", nullable=false, length=200)
	private String especialidad;
	
	@Column(name="jornada", nullable=false, length=1)
	private String jornada;
	
	public Medico() {
		
	}

}
