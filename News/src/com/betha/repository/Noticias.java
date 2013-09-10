/**
 * 
 */
package com.betha.repository;

import java.util.List;

import com.betha.business.Noticia;

/**
 * @author Lucas Natal
 *
 */
public interface Noticias {

	public List<Noticia> selecionar();
	public List<Noticia> selecionarUltimos(Integer last);
	public Noticia porCodigo(Integer id);
	public void inserir(Noticia noticia);
	public void atualizar(Noticia noticia);
	public void desabilitar(Noticia noticia);
	public void habilitar(Noticia noticia);
	
}
