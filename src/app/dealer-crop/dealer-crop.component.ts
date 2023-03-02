import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-dealer-crop',
  templateUrl: './dealer-crop.component.html',
  styleUrls: ['./dealer-crop.component.css']
})
export class DealerCropComponent implements OnInit{
  cropSale:any;

  constructor(private service:FarserService){
    this.cropSale='';
  }
  ngOnInit(): void {
    this.service.getAllCropSales().subscribe((data :any)=>{
      this.cropSale=data;
      
    })
  }
  buyCrop(){
    Swal.fire('Purchased Successfully','Contact Farmer');
  }

}
