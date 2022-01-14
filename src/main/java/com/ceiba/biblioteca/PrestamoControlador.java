package com.ceiba.biblioteca;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.biblioteca.model.Prestamo;
import com.ceiba.biblioteca.response.PrestamoResponse;
import com.ceiba.biblioteca.service.PrestamoService;

@RestController
@RequestMapping("prestamo")
public class PrestamoControlador {
	
	@Autowired
	private PrestamoService prestamoService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public PrestamoResponse save(Prestamo prestamo) {
		return prestamoService.save(prestamo);
	}


}

