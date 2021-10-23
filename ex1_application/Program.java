package ex1_application;
import ex1_entities.Postagem;
import ex1_entities.Usuario;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner 20/10/21
		
		
		Postagem p = new Postagem("I am at home");

		Usuario u1 = new Usuario("carlin","Carlos");
		u1.posta("We're dancing! Come with us");
		u1.posta("We're dreaming! Come with us");
		u1.posta("We're eating! Come with us");
		u1.posta("We're enjoying it! Come with us");
		u1.posta("We're going! Come with us");

		System.out.println(u1.getLogin());
		System.out.println(u1.buscaPost("We're dancing! Come with us"));
		System.out.println(u1.getPost(2));
		System.out.println(u1.buscaPost("We're going! Come with us"));

	}

}
