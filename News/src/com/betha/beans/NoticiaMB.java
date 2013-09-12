package com.betha.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.betha.business.Categoria;
import com.betha.business.Noticia;
import com.betha.repository.Categorias;
import com.betha.repository.Noticias;
import com.betha.util.FacesUtil;
import com.betha.util.Repository;

public class NoticiaMB {
	private Noticias noticias;
	private Categorias categorias;
	private Noticia noticiaSelecionada;

	private Noticia novaNoticia;

	private String filtro;
	private List<Noticia> todasNoticias;
	private List<Noticia> noticiasExibidas;
	private List<Categoria> listaCategorias;

	private FacesUtil facesUtil;
	private Repository repo = new Repository();

	public NoticiaMB() {
		this.noticias = repo.getNoticias();
		this.categorias = repo.getCategorias();

		this.novaNoticia = new Noticia();
		this.todasNoticias = this.noticias.selecionar();
		this.listaCategorias = this.categorias.selecionar();

		this.facesUtil = new FacesUtil();
	}

	public void gravar() {

		this.noticias = repo.getNoticias();
		this.noticias.inserir(novaNoticia);

		// Necessário no escopo session para atualizar a lista de edição.
		this.todasNoticias.add(novaNoticia);

		this.novaNoticia = new Noticia();
	}

	public Noticia getNovaNoticia() {
		return novaNoticia;
	}

	public void setNovaNoticia(Noticia novaNoticia) {
		this.novaNoticia = novaNoticia;
	}

	public Noticias getNoticias() {
		return noticias;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public List<Noticia> getTodasNoticias() {
		return todasNoticias;
	}

	public void setTodasNoticias(List<Noticia> todasNoticias) {
		this.todasNoticias = todasNoticias;
	}

	public List<Noticia> getNoticiasExibidas() {
		return noticiasExibidas;
	}

	public void setNoticiasExibidas(List<Noticia> noticiasExibidas) {
		this.noticiasExibidas = noticiasExibidas;
	}

	public void consultar() {
		this.noticiasExibidas = new ArrayList<Noticia>();
		for (int i = 0; i < this.todasNoticias.size(); i++) {
			if (this.todasNoticias.get(i).getTitulo().toLowerCase()
					.contains(this.filtro.toLowerCase())) {
				this.noticiasExibidas.add(this.todasNoticias.get(i));
			}
		}
	}

	public void atualizar() {

		try {
			noticias = repo.getNoticias();
			noticias.atualizar(noticiaSelecionada);
			facesUtil.adicionarMensagem(FacesMessage.SEVERITY_INFO,
					"Cadastro alterado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			facesUtil.adicionarMensagem(FacesMessage.SEVERITY_ERROR,
					"Não foi possível alterar!");
		}

	}

	public String redirecionaEditarNoticia() {
		return "EditarNoticia?faces-redirect=true";
	}

	public String redirecionaListaNoticias() {
		return "ListaNoticias?faces-redirect=true";
	}

	public String redirecionaExibeNoticia() {
		return "ExibeNoticia?faces-redirect=true";
	}

	public Noticia getNoticiaSelecionada() {
		return noticiaSelecionada;
	}

	public void setNoticiaSelecionada(Noticia noticiaSelecionada) {
		this.noticiaSelecionada = noticiaSelecionada;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

}
