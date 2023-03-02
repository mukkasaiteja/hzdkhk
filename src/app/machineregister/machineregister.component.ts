import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-machineregister',
  templateUrl: './machineregister.component.html',
  styleUrls: ['./machineregister.component.css']
})
export class MachineregisterComponent implements OnInit{
  constructor( private service : FarserService){}
  ngOnInit(): void {
    
  }
  machineReg(regForm:any){
    this.service.registerMachine(regForm).subscribe();
   alert('Machine registered Successfully');
   console.log(regForm);
  }

}
