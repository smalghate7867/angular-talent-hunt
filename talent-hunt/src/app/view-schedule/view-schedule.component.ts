import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewSchedule } from '../view-schedule';
import { AddScheduleServiceService } from '../add-schedule-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-view-schedule',
  templateUrl: './view-schedule.component.html',
  styleUrls: ['./view-schedule.component.css']
})
export class ViewScheduleComponent implements OnInit {
  scData: Observable<ViewSchedule[]>
  constructor(private httpViewService: AddScheduleServiceService) { }

  selectData = {
    id: 0,
    cname: '',
    email: '',
    cctc: '',
    ectc: '',
    gender: '',
    currentOrg: '',
    date: null,
    totalExp: '',
    releventExp: '',
    noticePeriod: '',
    stack: '',
    location: '',
    contactNo: '',
    relocate: '',
    interviewPannel: '',
  };
  reload() {
    this.httpViewService.findAll().subscribe(data => {
      console.log(data)
      this.scData = data;
    })
  }

  deleteUser(id) {
    this.httpViewService.deleteUser(id).subscribe(data => {
      this.reload();
    })
  }

  getalldata(user) {
    this.selectData = user;
    //  console.log("in get all data to view schedule "+this.selectData)
  }
  updateData(form) {
    console.log(form)
    this.httpViewService.updateUser(form.value).subscribe(data => {
      this.resetForm(form);
    })
  }
resetForm(form: NgForm){
  if (form) {
    form.resetForm();
  }
}
  ngOnInit() {
    this.reload();
  }

}
