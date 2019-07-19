package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Produto;

//Classe capaz de acessar o banco de dados.
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	//Classe especial do Spring capaz de receber um tipo de item(categoria,  e recebendo um parametro inteiro).
}
