package com.cesur.examen.ExamenGynny.galeria.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cesur.examen.ExamenGynny.galeria.model.ArtistDTO;

@Service
public class ArtistServiceImpl implements ArtistService{

	ArrayList<ArtistDTO> artists = new ArrayList<>();
	
	public ArtistServiceImpl(){
		artists.add(ar);
		artists.add(ar2);
		artists.add(ar3);
		artists.add(ar4);
	}

	ArtistDTO ar = new ArtistDTO(1, "Goya");
	ArtistDTO ar2 = new ArtistDTO(2, "Picasso");
	ArtistDTO ar3 = new ArtistDTO(3, "Dalí");
	ArtistDTO ar4 = new ArtistDTO(4, "Miró");

	
	@Override
	public ArtistDTO getArtistById(Integer id) {
		for(ArtistDTO artist:artists) {
			if(artist.getId()==id) {
				return artist;
			}
		}
		return null;
	}

}
