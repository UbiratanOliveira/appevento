package com.appevento.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.appevento.appevento.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

	
}