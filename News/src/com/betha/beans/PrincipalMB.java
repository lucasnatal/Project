/**
 * 
 */
package com.betha.beans;

import java.util.List;

import com.betha.business.Categoria;
import com.betha.business.Noticia;
import com.betha.repository.Categorias;
import com.betha.repository.Noticias;
import com.betha.util.Repository;

/**
 * @author Lucas Natal
 *
 */
public class PrincipalMB {

	private List<Noticia> listaNoticias;
	private List<Noticia> listaNoticiasExibidas;
	private List<Categoria> listaCategorias;
	
	private Repository repo = new Repository();
	private Noticias noticias;
	private Categorias categorias;
	
	private final String CAMINHO_IMG = "/resources/img/noticias/";
	
	public PrincipalMB() {

		this.noticias = repo.getNoticias();
		this.categorias = repo.getCategorias();
		
		this.listaNoticias = this.noticias.selecionar();
		this.listaNoticiasExibidas = this.noticias.selecionarUltimos(new Integer(9));
		this.setListaCategorias(this.categorias.selecionar());
		
	}
	
	public void filtrarPorCategoria(Integer last, Categoria categoria){
		
		this.noticias = repo.getNoticias();
		this.listaNoticiasExibidas = this.noticias.selecionarUltimos(last, categoria);
	}
	
	public List<Noticia> getListaNoticias() {
		return listaNoticias;
	}

	public List<Noticia> getListaNoticiasExibidas() {
		return listaNoticiasExibidas;
	}

	public String getCAMINHO_IMG() {
		return CAMINHO_IMG;
	}

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
	
}
