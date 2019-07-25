import { Component, OnInit } from '@angular/core';
import { AddRecruitmentServiceService } from '../add-recruitment-service.service';
import { Observable } from 'rxjs';
import { ViewSchedule } from '../view-schedule';
import { ViewRecruitment } from '../view-recruitment';

@Component({
  selector: 'app-view-recruitment',
  templateUrl: './view-recruitment.component.html',
  styleUrls: ['./view-recruitment.component.css']
})
export class ViewRecruitmentComponent implements OnInit {
  scData:Observable<ViewRecruitment[]>
  constructor(private httpViewService:AddRecruitmentServiceService) { }

selectData={
    id:0,
	  clientName:'',
	  noPosition:'',
	  stack:'',
	  expReq:'',
	  jobDesc:'',
	  location:'',
	  date:null,
};


  ngOnInit() {
    this.reload();
  }
  reload(){
    this.httpViewService.findAll().subscribe(data=>{
      console.log("RECRUIT DATA:  "+data)
      this.scData=data;
    })
  }
  deleteUser(id){
    this.httpViewService.deleteUser(id).subscribe(data=>{
      this.reload();
    })
  }
  getalldata(user){
    this.selectData=user;
  }
  updateData(form){
    this.httpViewService.updateUser(form.value).subscribe(data=>{
    
    })
  }



}
