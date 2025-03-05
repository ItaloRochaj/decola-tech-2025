import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { HomeComponent } from './home.component';
import { SomeService } from '../../services/some.service';
import { QuizzComponent } from '../../components/quizz/quizz.component';

describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeComponent, QuizzComponent],
      providers: [ SomeService ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render the title in QuizzComponent', () => {
    const compiled = fixture.nativeElement;
    console.log(compiled.innerHTML);
    const titleElement = compiled.querySelector('.quizz_logo h3');
    expect(titleElement).not.toBeNull();
    if (titleElement) {
      expect(titleElement.textContent).toContain('Você é um Herói ou um Vilão?');
    }
  });

  it('should have a defined variable', () => {
    expect(component.someVariable).toBeDefined();
  });

  it('should call a specific method', () => {
    spyOn(component, 'someMethod');
    component.ngOnInit();
    expect(component.someMethod).toHaveBeenCalled();
  });

  it('should fetch data from the service', () => {
    const service = fixture.debugElement.injector.get(SomeService);
    spyOn(service, 'getData').and.returnValue(of(['data1', 'data2']));
    component.ngOnInit();
    expect(component.data.length).toBe(2);
  });

  it('should fetch data from SomeService', () => {
    const service = TestBed.inject(SomeService);
    spyOn(service, 'getData').and.returnValue(of(['data1', 'data2']));
    component.ngOnInit();
    expect(component.data.length).toBe(2);
  });

  it('should interact correctly with SomeService', () => {
    const service = TestBed.inject(SomeService);
    spyOn(service, 'getData').and.returnValue(of(['data1', 'data2']));
    component.ngOnInit();
    expect(component.data.length).toBe(2);
  });
});
