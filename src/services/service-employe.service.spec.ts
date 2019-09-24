import { TestBed } from '@angular/core/testing';

import { ServiceEmployeService } from './service-employe.service';

describe('ServiceEmployeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceEmployeService = TestBed.get(ServiceEmployeService);
    expect(service).toBeTruthy();
  });
});
