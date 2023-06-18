import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProprietairesComponent } from './proprietaires.component';

describe('ProprietairesComponent', () => {
  let component: ProprietairesComponent;
  let fixture: ComponentFixture<ProprietairesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProprietairesComponent]
    });
    fixture = TestBed.createComponent(ProprietairesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
