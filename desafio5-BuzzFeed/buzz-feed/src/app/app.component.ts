import { Component, OnInit } from '@angular/core';
import { SomeService } from './services/some.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'buzz-feed';

  constructor(private someService: SomeService) { }

  ngOnInit(): void {
    this.someService.getData().subscribe(data => {
    });
  }

  someMethod(): void {
    console.log('someMethod foi chamado');
  }
}
