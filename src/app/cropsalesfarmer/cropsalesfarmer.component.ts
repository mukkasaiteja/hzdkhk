import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-cropsalesfarmer',
  templateUrl: './cropsalesfarmer.component.html',
  styleUrls: ['./cropsalesfarmer.component.css']
})
export class CropsalesfarmerComponent implements OnInit{
  farmer:any;
  farmerdata:any;
  constructor(private service:FarserService){
    this.farmer='';
    this.farmerdata='';
  }
  ngOnInit(): void {
    this.service.getAllCropSales().subscribe((data:any)=>{
      this.farmerdata=data;
    });
  }

}
