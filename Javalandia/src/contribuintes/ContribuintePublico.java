package contribuintes;

import java.time.LocalDate;

public class ContribuintePublico extends ContribuinteComSalario {

	public ContribuintePublico(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao,
			double salario) {
		super(nome, cpf, dataAdmissao, status, taxaContribuicao, salario);
	}

	@Override
	public String toString() {
		return "ContribuintePublico [salario=" + salario + ", taxaContribuicao=" + taxaContribuicao + ", getSalario()="
				+ getSalario() + ", toString()=" + super.toString() + ", getDataAdmissao()=" + getDataAdmissao()
				+ ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", isStatus()=" + isStatus()
				+ ", getTaxaContribuicao()=" + getTaxaContribuicao() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public double calcularContribuicaoMensal() {
		return this.salario * this.taxaContribuicao;
		
	}


	
}