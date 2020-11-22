package contribuintes;

import java.time.LocalDate;

public abstract class Contribuinte {
	
	private String nome;
	private String cpf;
	private LocalDate dataAdmissao;
	private boolean status;
	protected double taxaContribuicao;
	

	public Contribuinte(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.status = status;
		this.taxaContribuicao = taxaContribuicao;
	}
	
	
	public abstract double calcularContribuicaoMensal();
	
	
	public void imprimirContribuicaoMensal() {
		System.out.printf("A contribui��o mensal de %s � de R$ %.2f%n", this.nome, calcularContribuicaoMensal());
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
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


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public double getTaxaContribuicao() {
		return taxaContribuicao;
	}


	public void setTaxaContribuicao(double taxaContribuicao) {
		this.taxaContribuicao = taxaContribuicao;
	}

}	
