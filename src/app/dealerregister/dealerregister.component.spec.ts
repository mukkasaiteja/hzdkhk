import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DealerregisterComponent } from './dealerregister.component';

describe('DealerregisterComponent', () => {
  let component: DealerregisterComponent;
  let fixture: ComponentFixture<DealerregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DealerregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DealerregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
