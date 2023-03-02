import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmindetComponent } from './admindet.component';

describe('AdmindetComponent', () => {
  let component: AdmindetComponent;
  let fixture: ComponentFixture<AdmindetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdmindetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdmindetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
