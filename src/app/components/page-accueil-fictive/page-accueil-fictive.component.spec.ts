import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PageAccueilFictiveComponent } from './page-accueil-fictive.component';

describe('PageAccueilFictiveComponent', () => {
  let component: PageAccueilFictiveComponent;
  let fixture: ComponentFixture<PageAccueilFictiveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PageAccueilFictiveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PageAccueilFictiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
