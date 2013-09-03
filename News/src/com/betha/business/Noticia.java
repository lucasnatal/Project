package com.betha.business;

import java.util.Calendar;

/**
 * @author Jaaziel Lopes
 * 
 * */
public class Noticia {
	private Integer id;
	private String img;
	private String descricao;
	private Categoria categoria;
	private Calendar dateTimePublicacao;
	private Calendar dateTimeAtualização;
	private String autor;
	private String titulo;
	private Boolean status;

	public Noticia(Integer id, String img, String descricao,
			Categoria categoria, Calendar dateTimePublicacao,
			Calendar dateTimeAtualização, String autor, String titulo,
			Boolean status) {
		this.id = id;
		this.img = img;
		this.descricao = descricao;
		this.categoria = categoria;
		this.dateTimePublicacao = dateTimePublicacao;
		this.dateTimeAtualização = dateTimeAtualização;
		this.autor = autor;
		this.titulo = titulo;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Calendar getDateTimePublicacao() {
		return dateTimePublicacao;
	}

	public void setDateTimePublicacao(Calendar dateTimePublicacao) {
		this.dateTimePublicacao = dateTimePublicacao;
	}

	public Calendar getDateTimeAtualização() {
		return dateTimeAtualização;
	}

	public void setDateTimeAtualização(Calendar dateTimeAtualização) {
		this.dateTimeAtualização = dateTimeAtualização;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	
}
