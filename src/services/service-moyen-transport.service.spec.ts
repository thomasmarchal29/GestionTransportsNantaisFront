import { TestBed } from '@angular/core/testing';

import { ServiceMoyenTransportService } from './service-moyen-transport.service';

describe('ServiceMoyenTransportService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceMoyenTransportService = TestBed.get(ServiceMoyenTransportService);
    expect(service).toBeTruthy();
  });
});
