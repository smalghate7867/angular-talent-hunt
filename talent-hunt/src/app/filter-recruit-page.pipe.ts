import { Pipe, PipeTransform } from '@angular/core';
import { ViewRecruitment } from './view-recruitment';

@Pipe({
  name: 'filterRecruitPage'
})
export class FilterRecruitPagePipe implements PipeTransform {

  transform(value: ViewRecruitment[], search?:any): any {
    const newValue:ViewRecruitment[] = [];
    if (!value || !search) {
      return value;
    }
    for (const i of value) {
      if (i.clientName.toLowerCase().includes(search.toLowerCase()) || i.location.toString().includes(search)) {
        newValue.push(i);
      }
      
    }
    return newValue
  }

}
