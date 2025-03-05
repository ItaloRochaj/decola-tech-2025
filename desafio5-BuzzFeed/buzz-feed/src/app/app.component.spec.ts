import { ComponentFixture, fakeAsync, TestBed, tick } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import { AppComponent } from './app.component';
import { SomeService } from './services/some.service';
import { QuizzComponent } from './components/quizz/quizz.component';
import { HomeComponent } from './pages/home/home.component';
import { By } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';

describe('AppComponent', () => {
  let router: Router;
  let location: Location;
  let fixture: ComponentFixture<AppComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule.withRoutes([
          { path: '', component: HomeComponent },
          { path: 'quizz', component: QuizzComponent }
        ]),
        ReactiveFormsModule
      ],
      declarations: [
        AppComponent,
        HomeComponent,
        QuizzComponent
      ],
      providers: [SomeService],
    }).compileComponents();
    router = TestBed.inject(Router);
    location = TestBed.inject(Location);
    fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    router.initialNavigation();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'buzz-feed'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('buzz-feed');
  });

  it('should navigate to "quizz" route', fakeAsync(() => {
    router.navigate(['quizz']);
    tick();
    expect(location.path()).toBe('/quizz');
  }));

  it('should render title from QuizzComponent', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    const quizzTitle = compiled.querySelector('app-quizz h3')?.textContent;
    expect(quizzTitle).toBeDefined();
  });

  it('should handle button click', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    const button = compiled.querySelector('app-quizz button') as HTMLButtonElement;
    const quizzComponent = fixture.debugElement.query(By.directive(QuizzComponent)).componentInstance;
    spyOn(quizzComponent, 'buttonPress');
    button?.click();
    fixture.detectChanges();
    expect(quizzComponent.buttonPress).toHaveBeenCalled();
  });

  it('should navigate to QuizzComponent on button click', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    const button = compiled.querySelector('button') as HTMLButtonElement;
    expect(button).not.toBeNull();
    button.click();
    fixture.detectChanges();
    const quizzComponent = fixture.debugElement.query(By.directive(QuizzComponent));
    expect(quizzComponent).not.toBeNull();
  });

  it('should call someMethod on QuizzComponent initialization', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const quizzComponent = fixture.debugElement.query(By.directive(QuizzComponent)).componentInstance;
    spyOn(quizzComponent, 'someMethod');
    quizzComponent.ngOnInit();
    expect(quizzComponent.someMethod).toHaveBeenCalled();
  });
});
