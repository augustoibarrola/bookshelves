package com.heroes.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.heroes.entity.Book;

public class BookDTO {

	private Integer id;
	private String name;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static BookDTO setDTO(Book book) {
		BookDTO book = new BookDTO();
		book.setId(book.getId());
		book.setName(book.getName());
		
		return book;
	}


}
