import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayMachinesComponent } from './display-machines.component';

describe('DisplayMachinesComponent', () => {
  let component: DisplayMachinesComponent;
  let fixture: ComponentFixture<DisplayMachinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayMachinesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayMachinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
