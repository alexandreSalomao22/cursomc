package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;

//Classe capaz de acessar o banco de dados.
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	//Classe especial do Spring capaz de receber um tipo de item(categoria,  e recebendo um parametro inteiro).
}
