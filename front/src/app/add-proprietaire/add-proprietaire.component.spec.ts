import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProprietaireComponent } from './add-proprietaire.component';

describe('AddProprietaireComponent', () => {
  let component: AddProprietaireComponent;
  let fixture: ComponentFixture<AddProprietaireComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddProprietaireComponent]
    });
    fixture = TestBed.createComponent(AddProprietaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
