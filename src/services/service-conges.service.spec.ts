import { TestBed } from '@angular/core/testing';

import { ServiceCongesService } from './service-conges.service';

describe('ServiceCongesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceCongesService = TestBed.get(ServiceCongesService);
    expect(service).toBeTruthy();
  });
});
