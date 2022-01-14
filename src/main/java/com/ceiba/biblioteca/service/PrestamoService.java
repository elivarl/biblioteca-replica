package com.ceiba.biblioteca.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.biblioteca.model.Prestamo;
import com.ceiba.biblioteca.repository.PrestamoRepository;
import com.ceiba.biblioteca.response.PrestamoResponse;

@Service
public class PrestamoService {
	@Autowired
	private PrestamoRepository prestamoRepository;
	
	public PrestamoResponse save(Prestamo prestamo) {
		prestamo.setFechaMaximaDevolucion(LocalDate.now());
		prestamoRepository.save(prestamo);
		return new PrestamoResponse(prestamo.getId(), formatoFecha(prestamo.getFechaMaximaDevolucion()));
	}
	//formateo de fecha
	private String formatoFecha(LocalDate fechaMaximaDevolucion) {
		DateTimeFormatter formato;
		formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fechaMaximaDevolucion.format(formato);
	}

}
