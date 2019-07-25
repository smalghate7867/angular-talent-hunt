import { BrowserModule } from '@angular/platform-browser';
//import { NgModule } from '@angular/core';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddRecruitmentComponent } from './add-recruitment/add-recruitment.component';
import { ViewRecruitmentComponent } from './view-recruitment/view-recruitment.component';
import { AddScheduleComponent } from './add-schedule/add-schedule.component';
import { ViewScheduleComponent } from './view-schedule/view-schedule.component';
import { HomeComponent } from './home/home.component';
import { from } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { FilterPipePipe } from './filter-pipe.pipe';
import { FilterRecruitPagePipe } from './filter-recruit-page.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddRecruitmentComponent,
    ViewRecruitmentComponent,
    AddScheduleComponent,
    ViewScheduleComponent,
    HomeComponent,
    LoginComponent,
    FilterPipePipe,
    FilterRecruitPagePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
