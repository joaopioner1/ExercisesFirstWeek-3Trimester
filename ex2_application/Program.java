package ex2_application;

import java.time.LocalDate;

import ex2_entities.Estudante;

public class Program {

	public static void main(String[] args) {
		
		LocalDate dt1 = LocalDate.of(2000,4,1); 
		Estudante e1 = new Estudante("Joao", dt1);
		
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
	}
	
	static void print(Object msg) {
		System.out.println(msg);
	}
}
