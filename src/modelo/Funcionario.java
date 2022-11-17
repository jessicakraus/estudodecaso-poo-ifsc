package modelo;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

	private int matriculaEsocial;
	private LocalDate dataAdmissao;
	private Double salario;

	public int getMatriculaEsocial() {
		return matriculaEsocial;
	}

	public void setMatriculaEsocial(int matriculaEsocial) {
		this.matriculaEsocial = matriculaEsocial;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
