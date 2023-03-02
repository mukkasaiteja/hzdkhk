import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MachineregisterComponent } from './machineregister.component';

describe('MachineregisterComponent', () => {
  let component: MachineregisterComponent;
  let fixture: ComponentFixture<MachineregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MachineregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MachineregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
