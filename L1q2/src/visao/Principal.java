package visao;

import java.util.Scanner;

import dominio.Aluno;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		int op;
		
		do {
			System.out.println("---------------------------------------------------------\r\n"
					+ "MENU PRINCIPAL\r\n"
					+ "---------------------------------------------------------\r\n"
					+ "1 - CADASTRAR ALUNOS\r\n"
					+ "2 - CADASTRAR NOTAS\r\n"
					+ "3 - CALCULAR MÉDIAS\r\n"
					+ "4 - INFORMAR SITUAÇÕES\r\n"
					+ "5 - INFORMAR DADOS DE UM ALUNO \r\n"
					+ "6 - ALTERAR NOTA\r\n"
					+ "7 - SAIR\r\n"
					+ "---------------------------------------------------------");
			System.out.println("Escolha a opcao desejada: ");
			op = ler.nextInt();
			ler.nextLine();//limpar buffer
			switch(op) {
			
				case 1:
					System.out.println("CADASTRAR ALUNOS");
					System.out.println("Digite o nome do aluno 1: ");
					a1.setNome(ler.nextLine());

					System.out.println("Digite o matricula do aluno 1: ");
					a1.setMatricula(ler.nextInt());

					System.out.println("Digite o nome do aluno 2: ");
					a2.setNome(ler.nextLine());
					ler.nextLine();

					System.out.println("Digite o matricula do aluno 2: ");
					a2.setMatricula(ler.nextInt());
					ler.nextLine();

					System.out.println("Digite o nome do aluno 3: ");
					a3.setNome(ler.nextLine());

					System.out.println("Digite o matricula do aluno 3: ");
					a3.setMatricula(ler.nextInt());
					ler.nextLine();//limpar buffer

					break;
				case 2:
					System.out.println("CADASTRAR NOTAS");
					System.out.println("Digite a nota do aluno 1: ");
					a1.setNotas(ler.nextFloat(),ler.nextFloat(),ler.nextFloat()) ;
					ler.nextLine();

					System.out.println("Digite a nota do aluno 2: ");
					a2.setNotas(ler.nextFloat(),ler.nextFloat(),ler.nextFloat()) ;
					ler.nextLine();//limpar buffer

					System.out.println("Digite a nota do aluno 3: ");
					a3.setNotas(ler.nextFloat(),ler.nextFloat(),ler.nextFloat()) ;
					ler.nextLine();//limpar buffer
					break;
				case 3:
					System.out.println("CALCULAR MÉDIAS");
					a1.calcularMedia();
					a2.calcularMedia();
					a3.calcularMedia();
					
					System.out.println("Media do aluno 1: " + a1.getMedia());
					System.out.println("Media do aluno 2: " + a2.getMedia());
					System.out.println("Media do aluno 3: " + a3.getMedia());

					break;
				case 4:
					System.out.println("INFORMAR SITUAÇÕES");
					System.out.println(a1.getSituacao());
					System.out.println(a2.getSituacao());
					System.out.println(a3.getSituacao());
				
					a3.getSituacao();
					break;
				case 5:
					System.out.println("INFORMAR DADOS DE UM ALUNO");
					System.out.println("1 - Aluno 1\n 2 - Aluno 2\n 3 = Aluno 3");
					op = ler.nextInt();
					ler.nextLine();//limpar buffer

					if(op == 1 ) {
						System.out.println("nome aluno 1:" + a1.getNome() + "matricula do aluno:" + a1.getMatricula() 
						+ "media do aluno:" + a1.getMedia() + "situacao do aluno:" + a1.getSituacao());
					}if(op == 2) {
						System.out.println("nome aluno 2:" + a2.getNome() + "matricula do aluno:" + a2.getMatricula() 
						+ "media do aluno:" + a2.getMedia() + "situacao do aluno:" + a2.getSituacao());
					}if(op == 3) {
						System.out.println("nome aluno 3:" + a3.getNome() + "matricula do aluno:" + a3.getMatricula() 
						+ "media do aluno:" + a3.getMedia() + "situacao do aluno:" + a3.getSituacao());
					}else {
						System.out.println("Opcao invalida!");
					}
					break;
				case 6:
					System.out.println("ALTERAR NOTA");
					System.out.println("1 - Aluno 1\n 2 - Aluno 2\n 3 = aluno 3");
					op = ler.nextInt();
					ler.nextLine();//limpar buffer

					if(op == 1 ) {
						System.out.println("Escolha qual nota voce deseja alterar para o aluno 1: ");
						System.out.println("Informe a nota que deseja alterar(1) nota 1, (2) nota 2, "
								+ "(3) nota 3 e o valor desejado: ");
						a1.alterarNota(ler.nextInt(), ler.nextFloat());
						
					}if(op == 2) {
						System.out.println("Escolha qual nota voce deseja alterar para o aluno 2: ");
						System.out.println("Informe a nota que deseja alterar(1) nota 1, (2) nota 2, "
								+ "(3) nota 3 e o valor desejado: ");
						a2.alterarNota(ler.nextInt(), ler.nextFloat());
						
					}if(op == 3) {
						System.out.println("Escolha qual nota voce deseja alterar para o aluno 3: ");
						System.out.println("Informe a nota que deseja alterar(1) nota 1, (2) nota 2, "
								+ "(3) nota 3 e o valor desejado: ");
						a3.alterarNota(ler.nextInt(), ler.nextFloat());
						
					}else {
						System.out.println("Opcao invalida!");
					}
					break;
			}
				
					
			}while(op !=7);
		
	}
	
	
}
