import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindet',
  templateUrl: './admindet.component.html',
  styleUrls: ['./admindet.component.css']
})
export class AdmindetComponent implements OnInit{
  constructor(private router:Router){

  }
  ngOnInit(): void {
  
  }
  getAllFarmers(){
    this.router.navigate(['displFarA']);
  }
  getAllLabours(){
    this.router.navigate(['displayLabA']);
  }
  getAllMachines(){
    this.router.navigate(['displayMa']);
  }
}
