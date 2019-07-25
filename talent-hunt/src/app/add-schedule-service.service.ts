import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AddScheduleServiceService {

  constructor(private http : HttpClient) { }
  createUser(data){
    return this.http.post(`http://localhost:8080/company/employees`,data);
  }
  findAll():Observable<any>{
    return this.http.get<any>(`http://localhost:8080/company/employees`)
  }
  deleteUser(id){
    return this.http.delete<any>(`http://localhost:8080/company/delete/${id}`);
  }
  updateUser(data){
    console.log("data id"+data);
    console.log("in add schedule service update")
    return this.http.put<any>(`http://localhost:8080/company/update/${data.id}`,data);
  }
}
