import { TestBed } from '@angular/core/testing';

import { ServiceTechnicienService } from './service-technicien.service';

describe('ServiceTechnicienService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceTechnicienService = TestBed.get(ServiceTechnicienService);
    expect(service).toBeTruthy();
  });
});
