package com.api.livraria.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livros")
public class Livros implements Serializable{


	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		
		private String title;
		
		private String categoria;
		
		public Livros() {
			super();
			
		}

		public Livros(long id, String title, String categoria) {
			super();
			this.id = id;
			this.title = title;
			this.categoria = categoria;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Livros other = (Livros) obj;
			return id == other.id;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
