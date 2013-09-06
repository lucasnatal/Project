package com.betha.infra;

import java.util.List;

import org.hibernate.Session;

import com.betha.business.Noticia;
import com.betha.repository.Noticias;

public class NoticiaHibernate implements Noticias {

	private Session session;
	
	public NoticiaHibernate(Session session) {
		
		this.session = session;
	}
	
	
	@Override
	public List<Noticia> selecionar() {
		
		return this.session.createCriteria(Noticia.class).list();
	}

	@Override
	public Noticia porCodigo(Integer id) {
		
		return (Noticia) this.session.get(Noticia.class, id);
	}

	@Override
	public void inserir(Noticia noticia) {

		this.session.persist(noticia);		
	}

	@Override
	public void atualizar(Noticia noticia) {
		
		this.session.merge(noticia);
	}

	@Override
	public void desabilitar(Noticia noticia) {
		
		noticia.setStatus(false);
		this.session.merge(noticia);
		
	}

	@Override
	public void habilitar(Noticia noticia) {

		noticia.setStatus(true);
		this.session.merge(noticia);		
	}

	
}
