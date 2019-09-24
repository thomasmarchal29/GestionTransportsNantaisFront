import { TestBed } from '@angular/core/testing';

import { ServiceAdministrateurService } from './service-administrateur.service';

describe('ServiceAdministrateurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceAdministrateurService = TestBed.get(ServiceAdministrateurService);
    expect(service).toBeTruthy();
  });
});
