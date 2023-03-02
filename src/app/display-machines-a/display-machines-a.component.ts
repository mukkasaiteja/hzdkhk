import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-display-machines-a',
  templateUrl: './display-machines-a.component.html',
  styleUrls: ['./display-machines-a.component.css']
})
export class DisplayMachinesAComponent implements OnInit{
  
  machine:any;
  constructor(private service:FarserService){
    this.machine='';
  }
  ngOnInit(): void {
    this.service.getAllMachinesData().subscribe((data:any)=>{
      this.machine=data;
    })
  }
  machineRent(){
    alert('rented succefully');
  }
}
