package com.misiontic.citapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="medicos")
public class Medico {
	
	@Id
	@Column(name="idmedico", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedico;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idusuario", nullable = false, updatable = false, referencedColumnName = "idusuario")
	private Usuario idUsuario;
	
	@Column(name="especialidad", nullable=false, length=200)
	private String especialidad;
	
	@Column(name="jornada", nullable=false, length=1)
	private String jornada;
	
	@OneToMany(mappedBy="idMedico", cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	private List<Cita> ListaCitas;
	

}
