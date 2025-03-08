import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-popular-card',
  templateUrl: './popular-card.component.html',
  styleUrls: ['./popular-card.component.css']
})
export class PopularCardComponent implements OnInit {
  @Input()
  photoCover:string =""
  @Input()
  cardTitle:string= ""
  @Input()
  cardDescription:string =""
  @Input() Id: string = "0";

  constructor() { }

  ngOnInit(): void {
  }

}
