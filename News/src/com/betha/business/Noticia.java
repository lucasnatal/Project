package com.betha.business;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Jaaziel Lopes
 * 
 * */
@Entity
@Table(name = "noticias")
public class Noticia {
	private Integer id;
	private String img;
	private String descricao;
	private Categoria categoria;
	private Calendar dateTimePublicacao;
	private Calendar dateTimeAtualizacao;
	private String autor;
	private String titulo;
	private Boolean status;

	public Noticia(Integer id, String img, String descricao,
			Categoria categoria, Calendar dateTimePublicacao,
			Calendar dateTimeAtualizacao, String autor, String titulo,
			Boolean status) {
		this.id = id;
		this.img = img;
		this.descricao = descricao;
		this.categoria = categoria;
		this.dateTimePublicacao = dateTimePublicacao;
		this.dateTimeAtualizacao = dateTimeAtualizacao;
		this.autor = autor;
		this.titulo = titulo;
		this.status = status;
	}

	@Id
	@GeneratedValue
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

	@Column(name="id_categoria")
	@ManyToOne
	@JoinColumn(name="categoria") // pode estar errado
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name="date_time_publicacao")
	public Calendar getDateTimePublicacao() {
		return dateTimePublicacao;
	}
	
	public void setDateTimePublicacao(Calendar dateTimePublicacao) {
		this.dateTimePublicacao = dateTimePublicacao;
	}

	@Column(name="date_time_atualizacao")
	public Calendar getDateTimeAtualizacao() {
		return dateTimeAtualizacao;
	}

	public void setDateTimeAtualizacao(Calendar dateTimeAtualizacao) {
		this.dateTimeAtualizacao = dateTimeAtualizacao;
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
