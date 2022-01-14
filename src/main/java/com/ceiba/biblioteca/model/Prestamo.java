package com.ceiba.biblioteca.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name = "prestamos")
@Data
public class Prestamo {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String isbn;
	private String identificacionUsuario;
	private String tipoUsuario;
	private LocalDate fechaMaximaDevolucion;

}
