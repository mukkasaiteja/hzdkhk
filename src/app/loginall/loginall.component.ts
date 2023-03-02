import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-loginall',
  templateUrl: './loginall.component.html',
  styleUrls: ['./loginall.component.css']
})
export class LoginallComponent implements OnInit{
 
  users:any;
  farData:any;
  email:any;
  password:any;
  logUser:any;
  dealerData:any;
  machineData:any;
  labourData:any;
 constructor(private service:FarserService,private router:Router){
  this.users=[{'uid':'','uPass':''}];
  this.email='';
  this.password='';
  this.farData='';
  this.dealerData='';
  this.machineData='';
  this.labourData='';
  this.getAllUsers();
  this.getAllDealerData();
  this.getAllMachinesData();
  this.getAllLaboursData();
 }
  ngOnInit(): void {
    
  }
  getAllUsers(){

    this.service.getAllUsersDataFarmer().subscribe((data:any)=>{
  
      this.farData = data;
      console.log("this is userdata "+data);
  
    });
  }
  getAllDealerData(){
    this.service.getAllDealers().subscribe((data:any)=>{
      this.dealerData=data;
      
    })
  }
  getAllLaboursData(){
    this.service.getAllLabourData().subscribe((data:any)=>{
      this.labourData=data;
    })
  }

  getAllMachinesData(){
    this.service.getAllMachinesData().subscribe((data :any)=>{
      this.machineData=data;
    })
  }

  loginformsubmit(loginform :any){
    console.log(loginform);
    if(loginform.email =="FARMER" &&   loginform.password =="FARMER"){
      this.service.setUserLogged();
      this.router.navigate(['admin']);
      Swal.fire('Thank You','Welcome Admin','success')
      
      console.log(this.email);
      console.log(this.password);
      }
      else{
          for(let f of this.farData)
          {
            if(loginform.email == f.email && loginform.password ==  f.password){
              //this.logUser = f;
              // let ser = JSON.stringify(this.logUser);
              // localStorage.setItem("user",ser);
              Swal.fire('Welcome','You Had Logged In','success')
              this.service.setUserLogged();
             this.router.navigate(['farlogin']);
             return;
          }
           
          }
          for(let d of this.dealerData){
            if(loginform.email == d.email && loginform.password == d.password){
              Swal.fire('welcome','You are Logged In','success')
              this.service.setUserLogged();
              this.router.navigate(['darlog']);
              return;
            }
          }
          for(let m of this.machineData){
            if(loginform.email==m.email && loginform.password==m.password){
              Swal.fire('welcome to machines','login successfulll')
              this.router.navigate(['machlog']);
              return;
            }
          }
          for(let l of this.labourData){
            if(loginform.email==l.email && loginform.password==l.password){
              Swal.fire('welcome to Labour','login successfulll')
              this.router.navigate(['laburlog']);
              return;
            }
          }
         
        

        }
  }

}
