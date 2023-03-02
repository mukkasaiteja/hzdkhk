import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CropsaleregisterComponent } from './cropsaleregister.component';

describe('CropsaleregisterComponent', () => {
  let component: CropsaleregisterComponent;
  let fixture: ComponentFixture<CropsaleregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CropsaleregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropsaleregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
