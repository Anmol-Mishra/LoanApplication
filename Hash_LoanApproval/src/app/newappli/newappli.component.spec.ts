import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewappliComponent } from './newappli.component';

describe('NewappliComponent', () => {
  let component: NewappliComponent;
  let fixture: ComponentFixture<NewappliComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewappliComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewappliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
