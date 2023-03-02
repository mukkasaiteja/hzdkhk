import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CropsalesfarmerComponent } from './cropsalesfarmer.component';

describe('CropsalesfarmerComponent', () => {
  let component: CropsalesfarmerComponent;
  let fixture: ComponentFixture<CropsalesfarmerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CropsalesfarmerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropsalesfarmerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
