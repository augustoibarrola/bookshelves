package com.heroes.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.heroes.dto.BookDTO;

@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="NAME")
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static Book setEntity(BookDTO bookDTO) {
		Book book = new Book();
		if(bookDTO.getId()! = null) {
			book.setId(bookDTO.getId());			
		}
		book.setName(bookDTO.getName());
		return book;
	}
	
//	public static Hero setEntityFromOptional(Optional<Hero> optionalHero) {
//		Hero hero = new Hero();
//		hero.setId(optionalHero.get().getId());
//		hero.setName(optionalHero.get().getName());
//		hero.setAlias(optionalHero.get().getAlias());
//		hero.setSuperpower(optionalHero.get().getSuperpower());
//		hero.setWeakness(optionalHero.get().getWeakness());	
//		hero.setDescription(optionalHero.get().getDescription());
//		
//		return hero;
//	}
	
}
