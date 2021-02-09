package com.faith.app.service;

import java.util.List;

import com.faith.app.model.Category;

public interface ICategoryService {

	// method to add Category
	Category addCategory(Category category);

	// method to list all categories
	List<Category> listAllCategory();

	// to update an existing category
	Category updateCategory(Category category);

}