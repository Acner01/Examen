package com.cesur.examen.ExamenGynny.galeria.model;

import com.cesur.examen.ExamenGynny.galeria.validators.ArtworkCodeValidator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtworkDTO {

	
	Integer id;
	
	String title;
	 @ArtworkCodeValidator
	String descripcion;
	
	Integer artistId;
}
