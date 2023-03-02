import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-crop-sale-fa',
  templateUrl: './crop-sale-fa.component.html',
  styleUrls: ['./crop-sale-fa.component.css']
})
export class CropSaleFaComponent implements OnInit{
 
  farmerData:any;
  constructor(private service:FarserService){

  }
  
  ngOnInit(): void {
  this.service.getFarmerById().subscribe((data :any)=>{
    this.farmerData=data;
  })
  }

}
