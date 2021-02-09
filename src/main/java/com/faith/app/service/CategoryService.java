package com.faith.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faith.app.model.Category;
import com.faith.app.repository.ICategoryRepo;

@Service
public class CategoryService implements ICategoryService {

	// instance of ICategoryRepo
	public ICategoryRepo catRepo;

	// method to add Category
	@Override
	public Category addCategory(Category category) {
		return catRepo.save(category);
	}

	// method to list all categories
	@Override
	public List<Category> listAllCategory() {
		return catRepo.listAllCate();
	}

	// to update an existing category
	@Override
	public Category updateCategory(Category category) {
		return catRepo.save(category);
	}
}
