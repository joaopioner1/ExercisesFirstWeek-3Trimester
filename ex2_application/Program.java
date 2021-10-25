package ex2_application;

import java.time.LocalDate;

import ex2_entities.Estudante;
import ex2_entities.Turma;

public class Program {

	public static void main(String[] args) {
		
		LocalDate dt1 = LocalDate.of(2000,4,1); 
		LocalDate dt2 = LocalDate.of(2000,8,4); 
		LocalDate dt3 = LocalDate.of(2000,9,6); 
		LocalDate dt4 = LocalDate.of(1999,10,5); 
		LocalDate dt5 = LocalDate.of(2001,8,7); 
		LocalDate dt6 = LocalDate.of(2000,3,1); 
		LocalDate dt7 = LocalDate.of(1998,2,11); 

		Estudante e1 = new Estudante("Joao", dt1);
		Estudante e2 = new Estudante("Carlos", dt2);
		Estudante e3 = new Estudante("Adriana", dt3);
		Estudante e4 = new Estudante("Isadora", dt4);
		Estudante e5 = new Estudante("Enio", dt5);
		Estudante e6 = new Estudante("Vitor", dt6);
		Estudante e7 = new Estudante("Manuel", dt7);

		
		for (int i=0;i<9;i++) {
			e1.insereNota(i+2);
		}
		
		int index =0;
		for (Double est : e1.lista_notas) {
			System.out.println(index+" - "+est);
			System.out.println("----------");
			index += 1;
		}
		
		double media = e1.calculaMedia();
		int idade = e1.getIdade();
		
		print(media);
		print(idade);
		
		Turma t1 = new Turma("201INFO", 2021, "TECNICO_INFORMATICA");
		System.out.println(t1.getAno());
		System.out.println(t1.getEstudantes());
		t1.addEstudante(e1);
		t1.addEstudante(e2);
		t1.addEstudante(e3);
		t1.addEstudante(e4);
		t1.addEstudante(e5);
		t1.addEstudante(e6);
		t1.addEstudante(e7);

		System.out.println(t1.getEstudantes());
		System.out.println(t1.totalReprovados(7));

	}
	
	static void print(Object msg) {
		System.out.println(msg);
	}
}
