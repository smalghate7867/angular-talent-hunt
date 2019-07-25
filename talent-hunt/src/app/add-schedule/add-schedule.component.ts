import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AddScheduleServiceService } from '../add-schedule-service.service';

@Component({
  selector: 'app-add-schedule',
  templateUrl: './add-schedule.component.html',
  styleUrls: ['./add-schedule.component.css']
})
export class AddScheduleComponent implements OnInit {

  constructor(private scheduleService: AddScheduleServiceService) { }


  resetyyForm(form: NgForm) {
    if (form) {
      form.resetForm();
    }
  }


  submitForm(form) {
    this.scheduleService.createUser(form.value).toPromise().then(data => {
      console.log(data);
      this.resetyyForm(form);
    }).catch(err => {
      //this.resetForm(form);
      console.log(err);
    });
  }



  ngOnInit() {

  }

}
