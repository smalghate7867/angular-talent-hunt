import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddRecruitmentServiceService {

  constructor(private http:HttpClient) { }
//post data
createUser(data){
  return this.http.post(`http://localhost:8080/requirement/recruit`,data);
}
findAll():Observable<any>{
  return this.http.get<any>(`http://localhost:8080/requirement/getall`)
}
deleteUser(id){
  return this.http.delete<any>(`http://localhost:8080/requirement/delete/${id}`);
}
updateUser(data){
  console.log(data)
  return this.http.put<any>(`http://localhost:8080/requirement/update/${data.id}`,data);

}

}
