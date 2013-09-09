/**
 * 
 */
package com.betha.util;

import org.hibernate.Session;

import com.betha.business.Noticia;
import com.betha.infra.CategoriaHibernate;
import com.betha.infra.NoticiaHibernate;
import com.betha.repository.Categorias;
import com.betha.repository.Noticias;

/**
 * @author Lucas Natal
 *
 */
public class Repository {

	private Session session = (Session) new FacesUtil().getRequestAtribute("session");
	
	public Noticias getNoticias(){
		
		return new NoticiaHibernate(session);
	}
	
	public Categorias getCategorias(){
		
		return new CategoriaHibernate(session);
	}
	
}
