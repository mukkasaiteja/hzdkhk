import { Component, OnInit } from '@angular/core';
import { FarserService } from '../farser.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit{
  list:any;
  constructor(private service:FarserService){
    
  }
  ngOnInit(): void {
    this.pay();
    this.rzp1=new this.service.nativeWindow;
    this.rzp1.open();
  }
  pay(){
    this.service.getAllDealers().subscribe((data:any)=>{
      this.list=data;
    })
  }
  options = {
    "key": "rzp_test_7HdkaZ1xFGPomB", // Enter the Key ID generated from the Dashboard
    "amount": "5000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    "currency": "INR",
    "name": "Acme Corp",
    "description": "Test Transaction",
    "image": "https://example.com/your_logo",
    "order_id": "", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    "callback_url": "https://eneqd3r9zrjok.x.pipedream.net/",
    "prefill": {
        "name": "Mekala Harish",
        "email": "harish@example.com",
        "contact": "9999999999"
    },
    "notes": {
        "address": "Razorpay Corporate Office"
    },
    "theme": {
        "color": "#3399cc"
    }
}
rzp1:any;
}
