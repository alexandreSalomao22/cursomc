package com.nelioalves.cursomc.services.exceptions;

//classe modificada de exceção
public class ObjectNotFoundExcpetion extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundExcpetion(String msg) {
		super(msg);
	}

	public ObjectNotFoundExcpetion(String msg, Throwable cause) {
		super(msg, cause);
	}

}
