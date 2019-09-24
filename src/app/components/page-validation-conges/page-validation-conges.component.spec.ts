import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PageValidationCongesComponent } from './page-validation-conges.component';

describe('PageValidationCongesComponent', () => {
  let component: PageValidationCongesComponent;
  let fixture: ComponentFixture<PageValidationCongesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PageValidationCongesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PageValidationCongesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
