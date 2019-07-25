import { TestBed } from '@angular/core/testing';

import { AddRecruitmentServiceService } from './add-recruitment-service.service';

describe('AddRecruitmentServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddRecruitmentServiceService = TestBed.get(AddRecruitmentServiceService);
    expect(service).toBeTruthy();
  });
});
