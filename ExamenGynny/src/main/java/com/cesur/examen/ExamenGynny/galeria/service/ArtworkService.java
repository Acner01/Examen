package com.cesur.examen.ExamenGynny.galeria.service;

import java.util.ArrayList;

import com.cesur.examen.ExamenGynny.galeria.model.ArtworkDTO;

public interface ArtworkService {

	ArrayList< ArtworkDTO >   getAllArtworks();
	
	void createArtwork(ArtworkDTO artworkDTO);
}
