import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccueilEmployeComponent } from './accueil-employe.component';

describe('AccueilEmployeComponent', () => {
  let component: AccueilEmployeComponent;
  let fixture: ComponentFixture<AccueilEmployeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccueilEmployeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccueilEmployeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
