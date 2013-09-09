package com.betha.beans;

import java.util.List;

import com.betha.business.Noticia;
import com.betha.repository.Noticias;
import com.betha.util.Repository;


public class NoticiaMB {
	private Noticias noticias;
	private List<Noticia> todasNoticias;
	private List<Noticia> noticiasExibidas;

	public NoticiaMB() {
		this.noticias = (Noticias) Repository.getNoticias();
		this.todasNoticias = this.noticias.selecionar();
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
