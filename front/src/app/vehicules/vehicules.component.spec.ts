import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehiculesComponent } from './vehicules.component';

describe('VehiculesComponent', () => {
  let component: VehiculesComponent;
  let fixture: ComponentFixture<VehiculesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VehiculesComponent]
    });
    fixture = TestBed.createComponent(VehiculesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
