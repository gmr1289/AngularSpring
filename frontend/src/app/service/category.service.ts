import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Category } from '../component/product-list/category';

@Injectable({
  providedIn: 'root'
})

export class CategoryService {
  private baseUrl: string = "http://localhost:8080/api/categories";

  constructor(private httpClient: HttpClient) { }

  getCategory(): Observable<Category[]> {
    return this.httpClient.get<getResponse>(this.baseUrl).pipe(map(response => response._embedded.Category));
  }


}
interface getResponse {
  _embedded: {
    Category: Category[]
  }
}