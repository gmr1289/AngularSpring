import { Component } from '@angular/core';
import { ProductService } from 'src/app/service/product.service';
import { Product } from './product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {

  products: Product[] = [];

  constructor(private service: ProductService) { }

  ngOnInit() {
    this.listProduct();
  }

  listProduct() {
    this.service.getProductList().subscribe(data => this.products = data);
  }

}
