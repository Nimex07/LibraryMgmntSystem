package com.faith.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Category;

@Repository
public interface ICategoryRepo extends JpaRepositoryImplementation<Category, Integer> {

	@Query("from Category order by catId desc")
	List<Category> listAllCate();

}
