package com.appevento.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.appevento.appevento.models.Convidado;
import com.appevento.appevento.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
}
