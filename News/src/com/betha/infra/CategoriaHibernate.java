/**
 * 
 */
package com.betha.infra;

import java.util.List;

import org.hibernate.Session;

import com.betha.business.Categoria;
import com.betha.repository.Categorias;

/**
 * @author Lucas Natal
 *
 */
public class CategoriaHibernate implements Categorias{
	
	private Session session;
	
	public CategoriaHibernate(Session session) {

		this.session = session;
	}

	@Override
	public List<Categoria> selecionar() {
		
		return this.session.createCriteria(Categoria.class).list();
	}

	@Override
	public Categoria porCodigo(Integer id) {
		
		return (Categoria) this.session.get(Categoria.class, id);
	}

	@Override
	public void inserir(Categoria categoria) {

		this.session.persist(categoria);
		
	}

	@Override
	public void atualizar(Categoria categoria) {

		this.session.merge(categoria);
		
	}

	@Override
	public void desabilitar(Categoria categoria) {
	
		categoria.setStatus(false);
		this.session.merge(categoria);
		
	}

	@Override
	public void habilitar(Categoria categoria) {
		
		categoria.setStatus(true);
		this.session.merge(categoria);		
	}

}
