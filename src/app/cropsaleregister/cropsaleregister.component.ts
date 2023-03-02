import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-cropsaleregister',
  templateUrl: './cropsaleregister.component.html',
  styleUrls: ['./cropsaleregister.component.css']
})
export class CropsaleregisterComponent implements OnInit {
  constructor(private service : FarserService){}
  ngOnInit(): void {
   
  }
  CropSaleReg(regForm : any){
this.service.registerCropSale(regForm).subscribe();
    alert('crop registered Successfully');
    console.log(regForm);
  }

}
