package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.faith.app.model.Book;
import com.faith.app.repository.IBookRepo;

@Service
public class BookService {

	@Autowired
	private IBookRepo bookRepo;

	// insert book
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	// list all books
	public List<Book> viewAllBooks() {
		return bookRepo.listAllBooks();
	}

	// sort by book name
	public List<Book> sortByBook() {
		return bookRepo.sortByName();
	}

	// sort by category
	public List<Book> sortByCategory() {
		return bookRepo.sortByCategory();
	}

	// set available
	public Book setAvailable(Long bookId) {
		return bookRepo.setAvailable(bookId);
	}

	// set issued
	public Book setIssued(Long bookId) {
		return bookRepo.setIssured(bookId);
	}

}
