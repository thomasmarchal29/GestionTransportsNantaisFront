import { TestBed } from '@angular/core/testing';

import { ServiceChauffeurService } from './service-chauffeur.service';

describe('ServiceChauffeurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceChauffeurService = TestBed.get(ServiceChauffeurService);
    expect(service).toBeTruthy();
  });
});
