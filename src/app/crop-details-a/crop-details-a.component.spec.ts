import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CropDetailsAComponent } from './crop-details-a.component';

describe('CropDetailsAComponent', () => {
  let component: CropDetailsAComponent;
  let fixture: ComponentFixture<CropDetailsAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CropDetailsAComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropDetailsAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
