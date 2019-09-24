import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PageDemandeCongesComponent } from './page-demande-conges.component';

describe('PageDemandeCongesComponent', () => {
  let component: PageDemandeCongesComponent;
  let fixture: ComponentFixture<PageDemandeCongesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PageDemandeCongesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PageDemandeCongesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
