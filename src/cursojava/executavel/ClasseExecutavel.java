package cursojava.executavel;

import javax.swing.JOptionPane;

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
		
		
		// setando as notas do aluno.
		
		/*aluno1.setNota1(90);
		aluno1.setNota2(70.7);
		aluno1.setNota3(80);
		aluno1.setNota4(60);*/
		
		// obtando as notas do aluno pelo imput.
		
		String notaA = JOptionPane.showInputDialog("Informa a primaira nota ?");
		String notaB = JOptionPane.showInputDialog("Informa a segunda nota ?");
		String notaC = JOptionPane.showInputDialog("Informa a terçeira nota ?");
		String notaD = JOptionPane.showInputDialog("Informa a quarta nota ?");
		
		// convertendo as notas de Strings para double.
		
		aluno1.setNota1(Double.parseDouble(notaA));
		aluno1.setNota2(Double.parseDouble(notaB));
		aluno1.setNota3(Double.parseDouble(notaC));
		aluno1.setNota4(Double.parseDouble(notaD));
		
		// opção de visualização da média e os dados do aluno..
		
		int resultado = JOptionPane.showConfirmDialog(null, "Deseja ver a média e os dados do aluno ?");
		
		// condicional caso 0 == sim imprime os dados e a média do aluno.
		
		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "A média do aluno é = " + aluno1.getMediaNota());
			JOptionPane.showMessageDialog(null, " Aluno = " + aluno1.getNome() + "\n" + " Idade = " + aluno1.getIdade() + 
					"\n" + " Nascimento = " + aluno1.getDataNascimento() + "\n" + " Rg = " + aluno1.getRegistroGerla() +
					"\n" + " CPF = " + aluno1.getNumeroCpf() + "\n" + " nome da Mãe = " + aluno1.getNomeMae() +
					"\n" + " Nome do Pai = " + aluno1.getNomePai() + "\n" + " Matriculado em = " + aluno1.getDataMatricula() +
					"\n" + " Escola = " + aluno1.getNomeEscola() + "\n" + " Serie matricula = " + aluno1.getSerieMatriculado() +
					"\n" + " Média do aluno = " + aluno1.getMediaNota() + " : " + (aluno1.getAprovado() ? "Aprovado" : "Reprovado"));
		}
		
		// acessando os dados do aluno com o metodo get e imprimindo no console.
		
		System.out.println(" Aluno = " + aluno1.getNome() + "\n" + " Idade = " + aluno1.getIdade() + 
				"\n" + " Nascimento = " + aluno1.getDataNascimento() + "\n" + " Rg = " + aluno1.getRegistroGerla() +
				"\n" + " CPF = " + aluno1.getNumeroCpf() + "\n" + " nome da Mãe = " + aluno1.getNomeMae() +
				"\n" + " Nome do Pai = " + aluno1.getNomePai() + "\n" + " Matriculado em = " + aluno1.getDataMatricula() +
				"\n" + " Escola = " + aluno1.getNomeEscola() + "\n" + " Serie matricula = " + aluno1.getSerieMatriculado() +
				"\n" + " Média do aluno = " + aluno1.getMediaNota() + " : " + (aluno1.getAprovado() ? "Aprovado" : "Reprovado"));
	}

}
