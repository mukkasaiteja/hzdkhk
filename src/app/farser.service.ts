import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { PaymentComponent } from './payment/payment.component';
function _window() : any {
  // return the global native browser window object
  return window;
}
@Injectable({
  providedIn: 'root'
})
export class FarserService {
  
  get nativeWindow() : any {
    return _window();
 }
  
  private isUserLogged: any;
  constructor(private httpClient : HttpClient) { 
    this.isUserLogged=false;
  }
  setUserLogged(){
    this.isUserLogged=true;
  }
  getUserLogged(){
    return this.isUserLogged;
  }
  registerFarmer(regForm : any){
return this.httpClient.post('http://localhost:8080/faregister',regForm);
  }
  registerMachine(regForm: any){
    return this.httpClient.post('http://localhost:8080/mregister',regForm);
  }
  getAllMachines(){
    return this.httpClient.get('http://localhost:8080/mchList');
  }
  registerLabour(regForm : any){
    return this.httpClient.post('http://localhost:8080/labourRegister',regForm);
  }
  // getWeather(regForm:any){
  //   return this.httpClient.get('https://api.apixu.com/v1/current.json?key=YOUR_API_KEY&q=' + location);
  // }
  updateMachine(edittemp:any){
    return this.httpClient.put('http://localhost:8080/updateMachine',edittemp);
  }
  deleteMach(mid: number){
    return this.httpClient.delete('http://localhost:8080/deletebyId/'+mid);
  }
  registerDealer(regForm :any){
    return this.httpClient.post('http://localhost:8080/dealerregister',regForm);
  }
  getAllUsersDataFarmer(){
   return this.httpClient.get('http://localhost:8080/farmersList'); 
  }
  getAllLabourData(){
    return this.httpClient.get('http://localhost:8080/LabourList');
  }
  getAllDealers(){
    return this.httpClient.get('http://localhost:8080/dealerList');
  }
  getAllMachinesData(){
    return this.httpClient.get('http://localhost:8080/mchList'); 
  }
  registerCropSale(regForm:any){
    return this.httpClient.post('http://localhost:8080/CSSRegister',regForm);
  }
  getAllCropSales(){
    return this.httpClient.get('http://localhost:8080/csList');
  }
  getFarmerById(){
    return this.httpClient.get('http://localhost:8080/cropSaleById{cropsaleId}');
  }
}

