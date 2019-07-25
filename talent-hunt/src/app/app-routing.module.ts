import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { AddScheduleComponent } from './add-schedule/add-schedule.component';
import { HomeComponent } from './home/home.component';
import { ViewScheduleComponent } from './view-schedule/view-schedule.component';
import { AddRecruitmentComponent } from './add-recruitment/add-recruitment.component';
import { ViewRecruitmentComponent } from './view-recruitment/view-recruitment.component';


const routes: Routes = [
{path:'',component:HomeComponent},
{path:'addschedule',component:AddScheduleComponent},
{path:'viewschedule',component:ViewScheduleComponent},
{path:'addrecruitment',component:AddRecruitmentComponent},
{path:'viewrecruitment',component:ViewRecruitmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
