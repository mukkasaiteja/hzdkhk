import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindetComponent } from './admindet/admindet.component';
import { AuthenticationGuard } from './authentication.guard';
import { CropsaleregisterComponent } from './cropsaleregister/cropsaleregister.component';
import { CropsalesfarmerComponent } from './cropsalesfarmer/cropsalesfarmer.component';
import { DealerCropComponent } from './dealer-crop/dealer-crop.component';
import { DealerComponent } from './dealer/dealer.component';
import { DealerregisterComponent } from './dealerregister/dealerregister.component';
import { DisplayFarmersComponent } from './display-farmers/display-farmers.component';
import { DisplayLabourAComponent } from './display-labour-a/display-labour-a.component';
import { DisplayMachinesAComponent } from './display-machines-a/display-machines-a.component';
import { DisplayMachinesComponent } from './display-machines/display-machines.component';
import { FarmerComponent } from './farmer/farmer.component';
import { HeaderComponent } from './header/header.component';
import { LabourFarComponent } from './labour-far/labour-far.component';
import { LabourComponent } from './labour/labour.component';
import { LabourregisterComponent } from './labourregister/labourregister.component';
import { LoginallComponent } from './loginall/loginall.component';
import { MachineregisterComponent } from './machineregister/machineregister.component';
import { MachinesComponent } from './machines/machines.component';
import { PaymentComponent } from './payment/payment.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [{path:'',component:HeaderComponent},
                        {path:'farlogin',component:FarmerComponent},
                        {path:'darlog',component:DealerComponent},
                        {path:'machlog',component:MachinesComponent},
                        {path:'laburlog',component:LabourComponent},
                        {path:'farReg',component:RegisterComponent},
                      {path:'machreg',component:MachineregisterComponent},
                      {path:'displayMa',component:DisplayMachinesComponent},
                      {path:'labreg', component: LabourregisterComponent},
                    {path:'dealreg',component:DealerregisterComponent},
                    {path:'loginComp',component:LoginallComponent},
                    {path:'admin',canActivate:[AuthenticationGuard],component:AdmindetComponent},
                    {path:'displFarA',component:DisplayFarmersComponent},
                    {path:'displayLabA',component:DisplayLabourAComponent},
                    {path:'displayMachA',canActivate:[AuthenticationGuard],component:DisplayMachinesAComponent},
                    {path:'cropsaleRegister',canActivate:[AuthenticationGuard],component:CropsaleregisterComponent},
                    {path:'dealerCrop',canActivate:[AuthenticationGuard],component:DealerCropComponent},
                  {path:'labourF',canActivate:[AuthenticationGuard],component:LabourFarComponent},
                  {path:'cropsale',canActivate:[AuthenticationGuard],component:CropsalesfarmerComponent},
                  {path:'payment',canActivate:[AuthenticationGuard],component:PaymentComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
