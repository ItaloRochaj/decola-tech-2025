import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SomeService {
  constructor() { }

  getData(): Observable<any[]> {
    return of(['data1', 'data2']);
  }
}
