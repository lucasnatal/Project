package com.betha.beans;

import java.util.List;

import com.betha.business.Categoria;
import com.betha.business.Noticia;
import com.betha.repository.Categorias;
import com.betha.repository.Noticias;
import com.betha.util.Repository;


public class NoticiaMB {
	private Noticias noticias;
	private Categorias categorias;

	private Noticia novaNoticia;
	
	private List<Noticia> todasNoticias;
	private List<Noticia> noticiasExibidas;
	private List<Categoria> listaCategorias;

	
	public NoticiaMB() {
		this.noticias = (Noticias) Repository.getNoticias();
		this.categorias = (Categorias) Repository.getCategorias();
		
		this.novaNoticia = new Noticia();
		
		this.todasNoticias = this.noticias.selecionar();
		this.listaCategorias = this.categorias.selecionar();
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


}
