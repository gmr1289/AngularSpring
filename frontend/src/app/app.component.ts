import { Component } from '@angular/core';
import { CategoryService } from './service/category.service';
import { Category } from './component/product-list/category';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  category: Category[] = [];

  constructor(private service: CategoryService) { }

  ngOnInit() {
    this.listCategory();
  }

  listCategory() {
    this.service.getCategory().subscribe(data => this.category = data);
  }
}
