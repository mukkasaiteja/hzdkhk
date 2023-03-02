import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-dealerregister',
  templateUrl: './dealerregister.component.html',
  styleUrls: ['./dealerregister.component.css']
})
export class DealerregisterComponent implements OnInit{
  constructor(private service: FarserService){}
  ngOnInit(): void {
   
  }
  dealerReg(regForm:any){
    this.service.registerDealer(regForm).subscribe();
    alert('Dealer Registered Successfully');
    console.log(regForm);
  }

}
