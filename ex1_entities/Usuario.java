package ex1_entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {

	private ArrayList<Postagem> postagens; // ArrayList

	private final String login;
	private final String nome;

	public Usuario(String login, String nome) {
		this.login = login;
		this.nome = nome;
		this.postagens = new ArrayList<Postagem>();
	}

	public void posta(String conteudo) {
		postagens.add(new Postagem(conteudo, LocalDateTime.now()));
	}

	public Postagem getPost(int pos) {
		return postagens.get(pos);
	}
	
	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nome;
	}

	public Boolean apaga(Postagem p) {
		if (postagens.contains(p)) {
			postagens.remove(p);
			return true;
		}
		return false;
	}
	
	public int getTotalPosts() {
		return postagens.size();
	}
	
	public Postagem buscaPost(String valor) {
		for (int i = 0; i < postagens.size(); i++) {
			if (valor.contains((CharSequence) postagens.get(i))) {
				return postagens.get(i);
			}
		}
		return null;
	}

	
}
