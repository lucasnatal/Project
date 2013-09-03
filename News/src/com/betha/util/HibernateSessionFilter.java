package com.betha.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebFilter(servletNames="Faces Servlet")
public class HibernateSessionFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		Session session = FabricaSessao.abrirSessao();
		Transaction t = null;
		try {
			t = session.beginTransaction();
			request.setAttribute("session", session);
			chain.doFilter(request, response);
			t.commit();
		} catch (Exception e) {
			if (t != null) {
				t.rollback();
			}
		} finally {
			session.close();
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
