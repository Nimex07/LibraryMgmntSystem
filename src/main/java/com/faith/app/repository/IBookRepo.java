package com.faith.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.faith.app.model.Book;

public interface IBookRepo extends JpaRepositoryImplementation<Book, Long> {

	@Query(" from Book order by bookId desc")
	List<Book> listAllBooks();

	@Query(" from Book order by book")
	List<Book> sortByName();

	@Query("from Book order by category.category")
	List<Book> sortByCategory();

	@Query("update Book set status='Y' where bookId=?1")
	Book setAvailable(Long bookId);

	@Query("update Book set status='N' where bookId=?1")
	Book setIssured(Long bookId);

}
