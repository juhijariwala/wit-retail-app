import { Component, OnInit } from '@angular/core';
import {Item} from '../catalog/item';
import {CatalogService} from '../catalog/catalog.service';
@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit {

  items: Item[] = [];
  regModel: Item;
  selectedRow: number;
  catalogService: CatalogService;
  constructor(catalogService: CatalogService) {
    catalogService.getItems()
      .subscribe(items => {
        this.items = items;
      });

    this.catalogService = catalogService;
  }

  ngOnInit() {
  }

}
