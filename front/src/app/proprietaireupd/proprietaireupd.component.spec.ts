import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProprietaireupdComponent } from './proprietaireupd.component';

describe('ProprietaireupdComponent', () => {
  let component: ProprietaireupdComponent;
  let fixture: ComponentFixture<ProprietaireupdComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProprietaireupdComponent]
    });
    fixture = TestBed.createComponent(ProprietaireupdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
