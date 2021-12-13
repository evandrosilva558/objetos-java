package cursojava.executavel;

import cursojava.classes.Aluno;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		// Setando os valores dos atributos do objeto aluno.
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("11/10/1998");
		aluno1.setRegistroGerla("482144428");
		aluno1.setNumeroCpf("14141257890");
		aluno1.setNomeMae("Maria Jose do Alto");
		aluno1.setNomePai("Antonio Jose");
		aluno1.setDataMatricula("5/2/2020");
		aluno1.setNomeEscola("Uninove");
		aluno1.setSerieMatriculado("TADS-26");
		
		System.out.println(" Aluno = " + aluno1.getNome() + "\n" + " Idade = " + aluno1.getIdade() + 
				"\n" + " Nascimento = " + aluno1.getDataNascimento() + "\n" + " Rg = " + aluno1.getRegistroGerla() +
				"\n" + " CPF = " + aluno1.getNumeroCpf() + "\n" + " nome da Mãe = " + aluno1.getNomeMae() +
				"\n" + " Nome do Pai = " + aluno1.getNomePai() + "\n" + " Matriculado em = " + aluno1.getDataMatricula() +
				"\n" + " Escola = " + aluno1.getNomeEscola() + "\n" + " Serie matricula = " + aluno1.getSerieMatriculado());
	}

}
