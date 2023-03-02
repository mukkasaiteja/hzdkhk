import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  ngOnInit(): void {
    
  }
  constructor(private service : FarserService){}

  printDetails(regForm:any){
   this.service.registerFarmer(regForm).subscribe();
   alert('registered Successfully');
   console.log(regForm);
  }

}
