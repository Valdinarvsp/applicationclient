package model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long codigo;
	
	private String nome;
	
	private String cpf;
	
	private String status;
	
	public Cliente() {	
	}

	public Cliente(Long codigo, String nome, String cpf, String status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", status=" + status + "]";
	}
	
}
