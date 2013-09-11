package com.betha.infra;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.betha.business.Categoria;
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
		
		Calendar c = Calendar.getInstance();
		noticia.setStatus(true);
		noticia.setDateTimePublicacao(c);
		noticia.setDateTimeAtualizacao(c);
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


	@Override
	public List<Noticia> selecionarUltimos(Integer last) {

		return this.session.createCriteria(Noticia.class).setMaxResults(last).addOrder(Order.desc("id")).list();
	}


	@Override
	public List<Noticia> selecionarUltimos(Integer last, Categoria categoria) {
		
		return this.session.createCriteria(Noticia.class).setMaxResults(last).add(Restrictions.eq("categoria", categoria)).addOrder(Order.desc("id")).list();
	}

	
}
