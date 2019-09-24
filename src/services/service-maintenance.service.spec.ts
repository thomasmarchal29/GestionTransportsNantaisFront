import { TestBed } from '@angular/core/testing';

import { ServiceMaintenanceService } from './service-maintenance.service';

describe('ServiceMaintenanceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceMaintenanceService = TestBed.get(ServiceMaintenanceService);
    expect(service).toBeTruthy();
  });
});
