import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PagePersoEmployeComponent } from './page-perso-employe.component';

describe('PagePersoEmployeComponent', () => {
  let component: PagePersoEmployeComponent;
  let fixture: ComponentFixture<PagePersoEmployeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PagePersoEmployeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PagePersoEmployeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
