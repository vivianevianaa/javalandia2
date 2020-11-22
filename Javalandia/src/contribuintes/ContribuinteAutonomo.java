package contribuintes;

import java.time.LocalDate;

public class ContribuinteAutonomo extends Contribuinte{
	private double valorAposentadoria;
	
	public ContribuinteAutonomo(String nome, String cpf, LocalDate dataAdmissao, boolean status,
			double taxaContribuicao, double valorAposentadoria) {
		super(nome, cpf, dataAdmissao, status, taxaContribuicao);
		this.valorAposentadoria = valorAposentadoria;
	}
	

	public double getValorAposentadoria() {
		return valorAposentadoria;
	}

	public void setValorAposentadoria(double valorAposentadoria) {
		if (valorAposentadoria < 5000) {
			this.valorAposentadoria = valorAposentadoria;
		} else {
			System.out.print("Valor de aposentadoria maior que o esperado.");
		}
	}

	@Override
	public String toString() {
		return "ContribuinteAutonomo [valorAposentadoria=" + valorAposentadoria + ", taxaContribuicao="
				+ taxaContribuicao + ", getValorAposentadoria()=" + getValorAposentadoria() + ", getDataAdmissao()="
				+ getDataAdmissao() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", isStatus()="
				+ isStatus() + ", getTaxaContribuicao()=" + getTaxaContribuicao() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularContribuicaoMensal() {
		return this.valorAposentadoria * this.taxaContribuicao;
	}

	
}
