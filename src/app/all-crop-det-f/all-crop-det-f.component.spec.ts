import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllCropDetFComponent } from './all-crop-det-f.component';

describe('AllCropDetFComponent', () => {
  let component: AllCropDetFComponent;
  let fixture: ComponentFixture<AllCropDetFComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllCropDetFComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllCropDetFComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
