import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-labourregister',
  templateUrl: './labourregister.component.html',
  styleUrls: ['./labourregister.component.css']
})
export class LabourregisterComponent implements OnInit{
  constructor(private service : FarserService){}
  ngOnInit(): void {
    
  }
  registerLabour(regForm : any){
    this.service.registerLabour(regForm).subscribe();
    alert('Labour Registered Successfully');
    console.log(regForm);
  }

}
