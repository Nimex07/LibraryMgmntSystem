import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { ViewCategoryComponent } from './view-category/view-category.component';


const routes: Routes = [
  { path: "login", component: LoginComponent },
  {
    path: "librarian", component: LibrarianComponent,
    children: [
      { path: "addCategory", component: AddCategoryComponent },
      { path: "viewCategory", component: ViewCategoryComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
