package com.betha.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.betha.business.Categoria;
import com.betha.repository.Categorias;

@FacesConverter(forClass=Categoria.class)
public class CategoriaConverter implements Converter {

	private Repository repo = new Repository();
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Categoria retorno = null;
		if (value != null) {
			Categorias cat = repo.getCategorias();
			retorno = cat.porCodigo(new Integer(value));
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		if (value != null)
			return ((Categoria) value).getId().toString();
		return null;
	}

}
