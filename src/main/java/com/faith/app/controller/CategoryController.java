package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Category;
import com.faith.app.service.ICategoryService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CategoryController {

	@Autowired
	private ICategoryService catService;

	// post, for inserting into category
	@PostMapping("category")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		return new ResponseEntity<Category>(catService.addCategory(category), HttpStatus.OK);
	}

	// get, to get all data in Category
	@GetMapping("category")
	public ResponseEntity<List<Category>> viewCategory() {
		return new ResponseEntity<List<Category>>(catService.listAllCategory(), HttpStatus.OK);
	}

	// put, to update an existing category
	@PutMapping("category")
	public ResponseEntity<Category> updateCategory(Category category) {
		return new ResponseEntity<Category>(catService.updateCategory(category), HttpStatus.OK);
	}

}
