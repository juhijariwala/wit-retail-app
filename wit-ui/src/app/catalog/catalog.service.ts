import {Injectable} from '@angular/core';
import {Item} from './item';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../environments/environment';


const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};


@Injectable({
  providedIn: 'root'
})
export class CatalogService {
  private catalogApiUrl: string;

  constructor(private http: HttpClient) {
    this.catalogApiUrl = environment.CATALOG_BASE_URL + '/items';
  }

  getItems(): Observable<Item[]> {
    console.log('Calling url');
    return this.http.get<Item[]>(this.catalogApiUrl);
  }
}
