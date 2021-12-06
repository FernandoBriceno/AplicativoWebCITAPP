package com.misiontic.citapp.entity;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="citas")
public class Cita {
	
	@Id
	@Column(name="idcita", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCita;
	@Column(name="idmedico", nullable = false)
	private Long idMedico;
	@Column(name="idUsuario", nullable = false)
	private Long idUsuario;
	
	@Column(name="fecha", nullable = false)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date fecha;
	
	@Column(name="hora", nullable = false)
	private Time hora;
	
	@Column(name="consultorio", nullable = false)
	private Long consultorio;
	
	@Column(name="consulta", nullable = false, length=1000)
	private String consulta;
	
	@Column(name="diagnostico", nullable = false, length=1000)
	private String diagnostico;
	
	@Column(name="tratamiento", nullable = false, length=1000)
	private String tratamiento;
	
	@Column(name="estado", nullable = false, length=1)
	private String estado;
	

}
