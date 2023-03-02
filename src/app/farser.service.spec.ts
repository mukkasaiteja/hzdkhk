import { TestBed } from '@angular/core/testing';

import { FarserService } from './farser.service';

describe('FarserService', () => {
  let service: FarserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FarserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
