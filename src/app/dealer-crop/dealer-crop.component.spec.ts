import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DealerCropComponent } from './dealer-crop.component';

describe('DealerCropComponent', () => {
  let component: DealerCropComponent;
  let fixture: ComponentFixture<DealerCropComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DealerCropComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DealerCropComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
