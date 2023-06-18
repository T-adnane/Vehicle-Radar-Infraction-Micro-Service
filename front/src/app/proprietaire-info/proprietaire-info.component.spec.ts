import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProprietaireInfoComponent } from './proprietaire-info.component';

describe('ProprietaireInfoComponent', () => {
  let component: ProprietaireInfoComponent;
  let fixture: ComponentFixture<ProprietaireInfoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProprietaireInfoComponent]
    });
    fixture = TestBed.createComponent(ProprietaireInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
