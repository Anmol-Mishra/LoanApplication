import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewappliComponent } from './viewappli.component';

describe('ViewappliComponent', () => {
  let component: ViewappliComponent;
  let fixture: ComponentFixture<ViewappliComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewappliComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewappliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
