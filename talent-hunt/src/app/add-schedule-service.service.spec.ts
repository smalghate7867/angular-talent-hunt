import { TestBed } from '@angular/core/testing';

import { AddScheduleServiceService } from './add-schedule-service.service';

describe('AddScheduleServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddScheduleServiceService = TestBed.get(AddScheduleServiceService);
    expect(service).toBeTruthy();
  });
});
