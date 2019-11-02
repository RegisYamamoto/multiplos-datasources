package com.regis.multiplosdatasources.model.regis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inteesto {

	@Column(name = "IDXXINTECTRL")
	private long idxxintectrl;

	@Id
	@Column(name = "CODIPROD")
	private String codiprod;

	@Column(name = "CODIFILI")
	private int codifili;
	
	@Column(name = "QTDE")
	private long qtde;
	
	@Column(name = "STAT")
	private char stat;

	public long getIdxxintectrl() {
		return idxxintectrl;
	}

	public void setIdxxintectrl(long idxxintectrl) {
		this.idxxintectrl = idxxintectrl;
	}

	public String getCodiprod() {
		return codiprod;
	}

	public void setCodiprod(String codiprod) {
		this.codiprod = codiprod;
	}

	public int getCodifili() {
		return codifili;
	}

	public void setCodifili(int codifili) {
		this.codifili = codifili;
	}

	public long getQtde() {
		return qtde;
	}

	public void setQtde(long qtde) {
		this.qtde = qtde;
	}

	public char getStat() {
		return stat;
	}

	public void setStat(char stat) {
		this.stat = stat;
	}

}