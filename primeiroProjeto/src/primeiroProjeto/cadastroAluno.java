package primeiroProjeto;

import java.util.LinkedList;

import java.util.Scanner;



public class cadastroAluno {
	
	public static int menu(Scanner ent) {
		
		System.out.println("Escolha");
		System.out.println("");

		System.out.println("********************************* ");
		System.out.println("1 - Cadastrar dados do alunos  ");
		System.out.println("2 - ver lista de alunos ");
		System.out.println("********************************* ");
		System.out.println("");
		System.out.println("0 - Sair ");
		System.out.println("");
		
		
		
		return ent.nextInt();
	}
	
	
	public static aluno menuAluno (Scanner ent) {
		
		aluno aluno = new aluno();
		
		System.out.println("Preencha");
		System.out.println("");
		System.out.println("inserir nome ");
		aluno.nome = ent.next();
		
		System.out.println("inserir RA ");
		aluno.ra = ent.nextInt();
		
		System.out.println("inserir Curso ");
		aluno.curso = ent.next();
		
		System.out.println("inserir Turma ");
		aluno.turma = ent.next();
		
		System.out.println("inserir Periodo ");
		aluno.periodo = ent.next();
		
		
		return aluno;
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);		
		LinkedList<aluno> lista = new LinkedList();
		
		boolean continuar = true;
		while (continuar) {
			
			int op = menu(ent);
			
			if (op == 1) {
				System.out.println("");
				aluno novo = menuAluno(ent);
				lista.add(novo);
				
			} else if (op == 2 ){
				for (aluno aluno : lista) {
					System.out.println("");
					System.out.println("Aluno - " + aluno.nome);
					System.out.println("RA - "+aluno.ra);
					System.out.println("Turma - " +aluno.turma);
					System.out.println("Curso - "+aluno.curso);
					System.out.println("Periodo - " + aluno.periodo);
					System.out.println("");
				}
				

			}
			else if(op == 0) {
				continuar = false;
			}
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
