import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayFarmersComponent } from './display-farmers.component';

describe('DisplayFarmersComponent', () => {
  let component: DisplayFarmersComponent;
  let fixture: ComponentFixture<DisplayFarmersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayFarmersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayFarmersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
