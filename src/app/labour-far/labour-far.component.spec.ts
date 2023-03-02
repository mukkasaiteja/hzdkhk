import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabourFarComponent } from './labour-far.component';

describe('LabourFarComponent', () => {
  let component: LabourFarComponent;
  let fixture: ComponentFixture<LabourFarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LabourFarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LabourFarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
