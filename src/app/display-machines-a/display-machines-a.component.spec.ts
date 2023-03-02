import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayMachinesAComponent } from './display-machines-a.component';

describe('DisplayMachinesAComponent', () => {
  let component: DisplayMachinesAComponent;
  let fixture: ComponentFixture<DisplayMachinesAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayMachinesAComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayMachinesAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
