package ex1_entities;

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

	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nome;
	}

	public void posta(String conteudo) {
		postagens.add(new Postagem(conteudo));
	}

	public Postagem getPost(int pos) {
		return postagens.get(pos);
	}

	public boolean apaga(Postagem p) {
		if (!postagens.isEmpty()) {
			postagens.remove(p);
			return true;
		} else {
			return false;
		}
	}

	public int getTotalPosts() {
		return postagens.size();
	}

	public Postagem buscaPost(String valor) {
		for (int i = 0; i < postagens.size(); i++) {
			if (valor.equals(String.valueOf(postagens.get(i)))) {
				return postagens.get(i);
			}
		}
		return null;
	}
}
