import { TestBed } from '@angular/core/testing';

import { GestionTransportsServiceService } from './gestion-transports-service.service';

describe('GestionTransportsServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GestionTransportsServiceService = TestBed.get(GestionTransportsServiceService);
    expect(service).toBeTruthy();
  });
});
