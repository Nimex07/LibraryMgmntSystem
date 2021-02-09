import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient: HttpClient) { }

  // to add into category
  addCategory(category: Object) : Observable<any>{
    return this.httpClient.post(environment.apiurl + "/category", category);
  }

  // to get all category
  getCategoryList() :Observable<any>{
    return this.httpClient.get(environment.apiurl + "/category");
  }
}
