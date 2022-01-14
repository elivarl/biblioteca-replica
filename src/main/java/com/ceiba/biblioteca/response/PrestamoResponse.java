package com.ceiba.biblioteca.response;


import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class PrestamoResponse {
	private Long id;
	private String fechaMaximaDevolucion;

}
