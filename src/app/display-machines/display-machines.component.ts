import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

declare var jQuery :any;

@Component({
  selector: 'app-display-machines',
  templateUrl: './display-machines.component.html',
  styleUrls: ['./display-machines.component.css']
})
export class DisplayMachinesComponent implements OnInit{
  machinary : any;
  temp:any;
  edittemp:any;
  constructor(private service : FarserService){
    this.machinary="";
    this.edittemp={'machineName':'', 'ownerName':'','description':'','cost':'','mobileNumber':'','email':'','pic':''}
  }

  ngOnInit(): void {
    this.service.getAllMachines().subscribe((data : any) =>{
      this.machinary=data;
      console.log(data);
    })
  }

  showEditPopup(Machine: any){
    this.edittemp == Machine;
    jQuery('#machineModel').model('show');
    // jQuery('#machineModel').model('show');
  }

  updateMachine(){
    this.service.updateMachine(this.edittemp).subscribe();
    console.log(this.edittemp);
  }
  deleteMachine(machineId: number){
    this.service.deleteMach(machineId).subscribe((data :any)=>{
      console.log(data);
      const i=this.machinary.findIndex((element : any) =>{
        return element.machineId==machineId;
      })
      this.machinary.splice(i,1);
    })
  }

}
