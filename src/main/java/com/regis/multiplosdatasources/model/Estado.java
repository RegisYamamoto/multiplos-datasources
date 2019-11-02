package com.regis.multiplosdatasources.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "codigoref")
	private long codigoRef;

	private String nome;
	private char uf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCodigoRef() {
		return codigoRef;
	}

	public void setCodigoRef(long codigoRef) {
		this.codigoRef = codigoRef;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}

}