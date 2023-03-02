import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-farmer',
  templateUrl: './farmer.component.html',
  styleUrls: ['./farmer.component.css']
})
export class FarmerComponent implements OnInit {
  weatherData: any;
  constructor(private service : FarserService){}
  ngOnInit(): void {
   
  }
  // getWeatherDetails(regForm : any){
  //   this.service.getWeather(regForm.location).subscribe((data:any) => this.weatherData=data);
  //   console.log(this.weatherData);
  // }

}
