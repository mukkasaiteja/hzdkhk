import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-display-labour-a',
  templateUrl: './display-labour-a.component.html',
  styleUrls: ['./display-labour-a.component.css']
})
export class DisplayLabourAComponent implements OnInit{
  labour:any;
  constructor(private service:FarserService){
    this.labour='';
  }
  ngOnInit(): void {
    this.service.getAllLabourData().subscribe((data:any)=>{
      this.labour=data;
    })
  }

}
