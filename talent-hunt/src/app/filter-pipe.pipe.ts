import { Pipe, PipeTransform } from '@angular/core';
import { ViewSchedule } from './view-schedule';

@Pipe({
  name: 'filterPipe'
})
export class FilterPipePipe implements PipeTransform {

  transform(value: ViewSchedule[], search?:any): any {
    const newValue:ViewSchedule[] = [];
    if (!value || !search) {
      return value;
    }
    for (const i of value) {
      console.log("value in pipe ------------->"+value)
      console.log("i in ------------->"+i)
      if (i.email.toLowerCase().includes(search.toLowerCase()) || i.contactNo.toString().includes(search)) {
        newValue.push(i);
      }
      
    }
    return newValue
  }

}
