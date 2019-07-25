import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AddRecruitmentServiceService } from '../add-recruitment-service.service';

@Component({
  selector: 'app-add-recruitment',
  templateUrl: './add-recruitment.component.html',
  styleUrls: ['./add-recruitment.component.css']
})
export class AddRecruitmentComponent implements OnInit {

  constructor(private recruitService: AddRecruitmentServiceService) { }

  resetForm(form: NgForm) {
    if (form) {
      form.resetForm();
    }
  }
  submitForm(form) {
    this.recruitService.createUser(form.value).toPromise().then(data => {
      console.log(data);
      this.resetForm(form);
    }).catch(err => {

      console.log(err);
    });
  }

  ngOnInit() {
  }

}
