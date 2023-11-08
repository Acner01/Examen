package com.cesur.examen.ExamenGynny.galeria.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cesur.examen.ExamenGynny.galeria.model.ArtworkDTO;
import com.cesur.examen.ExamenGynny.galeria.service.ArtworkService;

@RestController
@RequestMapping("/galeria")
public class ArtworkRestController {

	@Autowired
	ArtworkService artworkservice;
	
	@GetMapping()
	public ResponseEntity<?> getAllArtwork(){
		return ResponseEntity.ok(artworkservice.getAllArtworks());
	}
	
	@PostMapping()
	public ResponseEntity<?> createBook(@RequestBody @Validated ArtworkDTO art){
		
		artworkservice.createArtwork(art);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(art.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();		
		
	}
}
