package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		// Setando os valores dos atributos do objeto aluno.
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Informe a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento ?");
		String registroGeral = JOptionPane.showInputDialog("Informe o rg ?");
		String numeroCpf = JOptionPane.showInputDialog("Informe o cpf ?");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da mãe ?");
		String nomePai = JOptionPane.showInputDialog("Informe o nome do pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Informe a data da matricula ?");
		String nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola ?");
		String serieMatriculado = JOptionPane.showInputDialog("Informe a serie ?");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome); 
		aluno1.setIdade(Integer.valueOf(idade)); // convertendo String em inteiro com integer.valueof().
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		
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
		
		// opção de ver os dados e as notas do aluno.
		
		int resultado = JOptionPane.showConfirmDialog(null, "Deseja ver a quantidade de carros por Pessoa ?");
		
		// condicional caso 0 == sim imprime os dados e a média do aluno.
		
		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, " Aluno = " + aluno1.getNome() + "\n" + " Idade = " + aluno1.getIdade() + 
					"\n" + " Nascimento = " + aluno1.getDataNascimento() + "\n" + " Rg = " + aluno1.getRegistroGeral() +
					"\n" + " CPF = " + aluno1.getNumeroCpf() + "\n" + " nome da Mãe = " + aluno1.getNomeMae() +
					"\n" + " Nome do Pai = " + aluno1.getNomePai() + "\n" + " Matriculado em = " + aluno1.getDataMatricula() +
					"\n" + " Escola = " + aluno1.getNomeEscola() + "\n" + " Serie matricula = " + aluno1.getSerieMatriculado() +
					"\n" + " Média do aluno = " + aluno1.getMediaNota() + " : " + (aluno1.getAprovado() ? "Aprovado" : "Reprovado"));
		}
		
		// acessando os dados do aluno com o metodo get e imprimindo no console.
		
		System.out.println(" Aluno = " + aluno1.getNome() + "\n" + " Idade = " + aluno1.getIdade() + 
				"\n" + " Nascimento = " + aluno1.getDataNascimento() + "\n" + " Rg = " + aluno1.getRegistroGeral() +
				"\n" + " CPF = " + aluno1.getNumeroCpf() + "\n" + " nome da Mãe = " + aluno1.getNomeMae() +
				"\n" + " Nome do Pai = " + aluno1.getNomePai() + "\n" + " Matriculado em = " + aluno1.getDataMatricula() +
				"\n" + " Escola = " + aluno1.getNomeEscola() + "\n" + " Serie matricula = " + aluno1.getSerieMatriculado() +
				"\n" + " Média do aluno = " + aluno1.getMediaNota() + " : " + (aluno1.getAprovado() ? "Aprovado" : "Reprovado"));
	}

}
