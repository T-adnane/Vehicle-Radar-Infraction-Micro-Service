import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehiculeInfoComponent } from './vehicule-info.component';

describe('VehiculeInfoComponent', () => {
  let component: VehiculeInfoComponent;
  let fixture: ComponentFixture<VehiculeInfoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VehiculeInfoComponent]
    });
    fixture = TestBed.createComponent(VehiculeInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
