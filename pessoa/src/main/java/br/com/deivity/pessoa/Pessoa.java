package br.com.deivity.pessoa;

public abstract class Pessoa {

	private String documento;

	public Pessoa(String documento) {
		this.documento=documento;
	}
	public String getDocumento(){
		return documento;	
	}
	public abstract Boolean validarDocumento();

}
