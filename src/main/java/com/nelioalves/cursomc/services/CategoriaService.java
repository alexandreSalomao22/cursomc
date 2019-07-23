package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundExcpetion;

import javassist.tools.rmi.ObjectNotFoundException;

//classe responsavel por acessar o banco de dados (DAO)
@Service
public class CategoriaService {

	// Automaticamente instanciada pelo Spring, injeçao de dependencia ou inversão
	// de valores.
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		//adiciona um retorno lambda recebendo uma exceção modificada.
		return obj.orElseThrow(() -> new ObjectNotFoundExcpetion(
				"Objeto não encontrado! Id: " + id + ", Tipo " + Categoria.class.getName()));
	}

}
