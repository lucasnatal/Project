/**
 * 
 */
package com.betha.repository;

import java.util.List;

import com.betha.business.Categoria;
import com.betha.business.Noticia;

/**
 * @author Lucas Natal
 *
 */
public interface Categorias {

	public List<Categoria> selecionar();
	public Categoria porCodigo(Integer id);
	public void inserir(Categoria categoria);
	public void atualizar(Categoria categoria);
	public void desabilitar(Categoria categoria);
	public void habilitar(Categoria categoria);
}
