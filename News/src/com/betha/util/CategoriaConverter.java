package com.betha.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.betha.business.Categoria;
import com.betha.repository.Categorias;

@FacesConverter(forClass=Categoria.class)
public class CategoriaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Categorias cat = Repository.getCategorias();
		if (value != null) {
			Categoria categoria = cat.porCodigo(new Integer(value));
			return categoria;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		if (value != null)
			return ((Categoria) value).getId().toString();
		return null;
	}

}
