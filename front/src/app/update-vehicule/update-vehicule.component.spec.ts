import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVehiculeComponent } from './update-vehicule.component';

describe('UpdateVehiculeComponent', () => {
  let component: UpdateVehiculeComponent;
  let fixture: ComponentFixture<UpdateVehiculeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateVehiculeComponent]
    });
    fixture = TestBed.createComponent(UpdateVehiculeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
