import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CropSaleFaComponent } from './crop-sale-fa.component';

describe('CropSaleFaComponent', () => {
  let component: CropSaleFaComponent;
  let fixture: ComponentFixture<CropSaleFaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CropSaleFaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropSaleFaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
