import { ComponentFixture, TestBed } from '@angular/core/testing';
import { QuizzComponent } from './quizz.component';

describe('QuizzComponent', () => {
  let component: QuizzComponent;
  let fixture: ComponentFixture<QuizzComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuizzComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(QuizzComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizzComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render the title', () => {
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('h3').textContent).toBeDefined();;
  });

  it('should have a defined variable', () => {
    expect(component.someVariable).toBeDefined();
  });

  it('should call a specific method', () => {
    spyOn(component, 'someMethod');
    component.ngOnInit();
    expect(component.someMethod).toHaveBeenCalled();
  });

  it('should handle button click', () => {
    spyOn(component, 'buttonPress');
    const button = fixture.debugElement.nativeElement.querySelector('button');
    button.click();
    expect(component.buttonPress).toHaveBeenCalled();
  });

  it('should add answer and call nextStep on buttonPress', () => {
    spyOn(component, 'nextStep');
    component.buttonPress('answer');
    expect(component.answers).toContain('answer');
    expect(component.nextStep).toHaveBeenCalled();
  });

  it('should return correct result on checkResult', async () => {
    component.answers = ['answer1', 'answer2', 'answer2'];
    const result = await component.checkResult(component.answers);
    expect(result).toBe('answer2');
  });

  it('should return correct result on checkResult with different answers', async () => {
    component.answers = ['answer1', 'answer2'];
    const result = await component.checkResult(component.answers);
    expect(result).toBe('answer2');
  });

  it('should handle button press and navigate to next question', () => {
    const fixture = TestBed.createComponent(QuizzComponent);
    const component = fixture.componentInstance;
    fixture.detectChanges();

    spyOn(component, 'nextStep');
    const button = fixture.nativeElement.querySelector('button');
    button.click();
    fixture.detectChanges();

    expect(component.nextStep).toHaveBeenCalled();
  });
});
