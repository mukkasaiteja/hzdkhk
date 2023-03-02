import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-display-farmers',
  templateUrl: './display-farmers.component.html',
  styleUrls: ['./display-farmers.component.css']
})
export class DisplayFarmersComponent implements OnInit{
  farmer:any;
  temp:any;
  constructor(private service : FarserService){
    this.farmer='';
    this.temp={'farmerId':'','farmerName':'','address':'','mobileNumber':'','email':''};
  }
  ngOnInit(): void {
   this.service.getAllUsersDataFarmer().subscribe((data :any) =>{
    this.farmer=data;
    console.log(data);
   });
  }

}
