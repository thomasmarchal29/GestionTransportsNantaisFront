import { TestBed } from '@angular/core/testing';

import { ServiceMissionChauffeurService } from './service-mission-chauffeur.service';

describe('ServiceMissionChauffeurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceMissionChauffeurService = TestBed.get(ServiceMissionChauffeurService);
    expect(service).toBeTruthy();
  });
});
