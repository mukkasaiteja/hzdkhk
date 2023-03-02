import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabourregisterComponent } from './labourregister.component';

describe('LabourregisterComponent', () => {
  let component: LabourregisterComponent;
  let fixture: ComponentFixture<LabourregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LabourregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LabourregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
