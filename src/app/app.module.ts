import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { BookComponent } from './book/book.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { ViewCategoryComponent } from './view-category/view-category.component';
import { LibrarianComponent } from './librarian/librarian.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    BookComponent,
    AddCategoryComponent,
    ViewCategoryComponent,
    LibrarianComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
