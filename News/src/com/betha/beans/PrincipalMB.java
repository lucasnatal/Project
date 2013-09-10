/**
 * 
 */
package com.betha.beans;

import java.util.List;

import com.betha.business.Noticia;
import com.betha.repository.Noticias;
import com.betha.util.Repository;

/**
 * @author Lucas Natal
 *
 */
public class PrincipalMB {

	private List<Noticia> listaNoticias;
	private List<Noticia> listaNoticiasExibidas;
	
	private Repository repo = new Repository();
	private Noticias noticias;
	
	public PrincipalMB() {
		
		this.noticias = repo.getNoticias();
		this.listaNoticias = this.noticias.selecionar();
		this.listaNoticiasExibidas = this.noticias.selecionarUltimos(new Integer(9));
	}
	
	
}
