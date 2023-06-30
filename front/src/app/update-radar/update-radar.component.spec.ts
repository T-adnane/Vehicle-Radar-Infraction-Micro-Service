import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateRadarComponent } from './update-radar.component';

describe('UpdateRadarComponent', () => {
  let component: UpdateRadarComponent;
  let fixture: ComponentFixture<UpdateRadarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateRadarComponent]
    });
    fixture = TestBed.createComponent(UpdateRadarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
