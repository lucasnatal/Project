/**
 * 
 */
package com.betha.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Lucas Natal
 *
 */
@Entity
@Table(name="categorias")
public class Categoria {
private Integer id;
private String nome;
private Boolean status;

public Categoria(Integer id, String nome, Boolean status) {
	this.id = id;
	this.nome = nome;
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

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Boolean getStatus() {
	return status;
}

public void setStatus(Boolean status) {
	this.status = status;
}

}
