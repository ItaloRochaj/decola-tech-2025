import { Component, Inject, OnDestroy } from '@angular/core';
import { SERVICES_TOKEN } from "../../services/service.token";
import { ICLientService } from "../../services/api-client/clients/iclients.service";
import { ClientsService } from "../../services/api-client/clients/clients.service";
import { ClientFormComponent } from "../components/client-form/client-form.component";
import { ClientModelForm } from '../client.models';
import { Subscription } from 'rxjs';
import { Router } from '@angular/router';
import { ISnackbarManagerService } from '../../services/isnackbar-manager.service';
import { SnackbarManagerService } from '../../services/snackbar-manager.service';

@Component({
  selector: 'app-new-client',
  imports: [ClientFormComponent],
  templateUrl: './new-client.component.html',
  styleUrls: ['./new-client.component.scss'],
  providers: [
    { provide: SERVICES_TOKEN.HTTP.CLIENT, useClass: ClientsService },
    { provide: SERVICES_TOKEN.SNACKBAR, useClass: SnackbarManagerService }
  ]
})
export class NewClientComponent implements OnDestroy {

  private httpSubscription?: Subscription;
  private routeSubscription?: Subscription;

  constructor(
    @Inject(SERVICES_TOKEN.HTTP.CLIENT) private readonly httpService: ICLientService,
    @Inject(SERVICES_TOKEN.SNACKBAR) private readonly snackBarManager: ISnackbarManagerService,
    private readonly router: Router
  ) {}

  ngOnDestroy(): void {
    if (this.httpSubscription) {
      this.httpSubscription.unsubscribe();
    }
  }

  onSubmitClient(value: ClientModelForm): void {
    const { id, ...request } = value
    console.log(value);
    this.httpSubscription = this.httpService.save(request).subscribe(_ => {
      console.log(request);
      this.snackBarManager.show('Usuario cadastrado com sucesso!');
      this.router.navigate(['/clients/list']);
    }, error => {
      console.error('Error:', error);
      this.snackBarManager.show('Erro ao cadastrar usuario!');
    });
  }
}
