import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HttpClientModule} from '@angular/common/http';
import { MainComponent } from './main/main.component';
import { FarmerComponent } from './farmer/farmer.component';
import { RegisterComponent } from './register/register.component';
import { DealerComponent } from './dealer/dealer.component';
import { MachinesComponent } from './machines/machines.component';
import { LabourComponent } from './labour/labour.component';
import { DealerregisterComponent } from './dealerregister/dealerregister.component';
import { LabourregisterComponent } from './labourregister/labourregister.component';
import { MachineregisterComponent } from './machineregister/machineregister.component';
import { DisplayMachinesComponent } from './display-machines/display-machines.component';
import { LoginallComponent } from './loginall/loginall.component';
import { AdmindetComponent } from './admindet/admindet.component';
import { DisplayFarmersComponent } from './display-farmers/display-farmers.component';
import { DisplayLabourAComponent } from './display-labour-a/display-labour-a.component';
import { DisplayMachinesAComponent } from './display-machines-a/display-machines-a.component';
import { CropDetailsAComponent } from './crop-details-a/crop-details-a.component';
import { CropsalesfarmerComponent } from './cropsalesfarmer/cropsalesfarmer.component';
import { CropsaleregisterComponent } from './cropsaleregister/cropsaleregister.component';
import { DealerCropComponent } from './dealer-crop/dealer-crop.component';
import { AllCropDetFComponent } from './all-crop-det-f/all-crop-det-f.component';
import { LabourFarComponent } from './labour-far/labour-far.component';
import { CropSaleFaComponent } from './crop-sale-fa/crop-sale-fa.component';
import { PaymentComponent } from './payment/payment.component'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    FarmerComponent,
    RegisterComponent,
    DealerComponent,
    MachinesComponent,
    LabourComponent,
    DealerregisterComponent,
    LabourregisterComponent,
    MachineregisterComponent,
    DisplayMachinesComponent,
    LoginallComponent,
    AdmindetComponent,
    DisplayFarmersComponent,
    DisplayLabourAComponent,
    DisplayMachinesAComponent,
    CropDetailsAComponent,
    CropsalesfarmerComponent,
    CropsaleregisterComponent,
    DealerCropComponent,
    AllCropDetFComponent,
    LabourFarComponent,
    CropSaleFaComponent,
    PaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
