import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayLabourAComponent } from './display-labour-a.component';

describe('DisplayLabourAComponent', () => {
  let component: DisplayLabourAComponent;
  let fixture: ComponentFixture<DisplayLabourAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayLabourAComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayLabourAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
