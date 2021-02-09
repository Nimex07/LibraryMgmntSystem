import { Component, OnInit } from '@angular/core';
import { Category } from '../category';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.scss']
})
export class AddCategoryComponent implements OnInit {

  category: Category;
  addCategoryForm: FormGroup;

  constructor(private formBuilder: FormBuilder,
    private categoryService: CategoryService) { }

  ngOnInit(): void {
    this.createForm();
  }

  createForm() {
    this.addCategoryForm = this.formBuilder.group({
      category: ['', Validators.required] // wont accept empty
    });
  }

  onSubmit() {
    //assigning values into category from fromGroup
    this.category = this.addCategoryForm.value;
    console.log(this.category);

    //calling method to insert
    this.categoryService.addCategory(this.category).subscribe(
      data => console.log(data), error => console.log(error)
    );
  }
}
