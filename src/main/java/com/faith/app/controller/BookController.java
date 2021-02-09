package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Book;
import com.faith.app.service.BookService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

	@Autowired
	private BookService bookService;

	// method to add a book
	@PostMapping("book")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.addBook(book), HttpStatus.OK);
	}

	// method to view all books
	@GetMapping("book")
	public ResponseEntity<List<Book>> viewAllBooks() {
		return new ResponseEntity<List<Book>>(bookService.viewAllBooks(), HttpStatus.OK);
	}

	// method to view books sorted by name
	@GetMapping("sort-by-name")
	public ResponseEntity<List<Book>> sortByName() {
		return new ResponseEntity<List<Book>>(bookService.sortByBook(), HttpStatus.OK);
	}

	// method to sort by category
	@GetMapping("sort-by-category")
	public ResponseEntity<List<Book>> sortByCategory() {
		return new ResponseEntity<List<Book>>(bookService.sortByCategory(), HttpStatus.OK);
	}

	// method to update status to available
	@PutMapping("available/bookId")
	public ResponseEntity<Book> available(@PathVariable("bookId") Long bookId) {
		return new ResponseEntity<Book>(bookService.setAvailable(bookId), HttpStatus.OK);
	}

	// method to update status to issued
	@PutMapping("issued/bookId")
	public ResponseEntity<Book> issued(@PathVariable("bookId") Long bookId) {
		return new ResponseEntity<Book>(bookService.setIssued(bookId), HttpStatus.OK);
	}
}
