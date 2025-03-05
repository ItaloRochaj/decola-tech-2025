import { Component, OnInit } from '@angular/core';
import { SomeService } from '../../services/some.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  someVariable: any;
  data: any[] = [];

  constructor(private someService: SomeService) { }

  ngOnInit(): void {
    this.someMethod();
    this.someService.getData().subscribe((data: any[]) => {
      this.data = data;
    });
  }

  someMethod(): void {
    this.someVariable = 'Valor inicial';
    console.log('someMethod foi chamado');
  }
}
