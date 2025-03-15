import { Injectable } from '@angular/core';
import { ICLientService } from './iclients.service';
import { Observable } from 'rxjs';
import { SaveClientRequest, SaveClientResponse, UpdateClientRequest, UpdateClientResponse, ListClientResponse, DetailClientResponse } from './client.models';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../../environment/environment';

@Injectable({
  providedIn: 'root'
})
export class ClientsService implements ICLientService {

  // Configurando a URL base a partir do environment
  private readonly basePath = environment.apiUrl;

  constructor(private http: HttpClient) {
    // Log para verificar a URL base ao inicializar o serviço
    console.log('Base URL configurada:', this.basePath);
  }

  // Método para salvar um cliente
  save(request: SaveClientRequest): Observable<SaveClientResponse> {
    console.log('Enviando solicitação para salvar cliente:', request);
    return this.http.post<SaveClientResponse>(`${this.basePath}/clients/cadastro`, request);
  }

  // Método para atualizar um cliente
  update(id: number, request: UpdateClientRequest): Observable<UpdateClientResponse> {
    console.log(`Enviando solicitação para atualizar cliente ID: ${id}`, request);
    return this.http.put<UpdateClientResponse>(`${this.basePath}/clients/${id}`, request);
  }

  // Método para excluir um cliente
  delete(id: number): Observable<void> {
    console.log(`Enviando solicitação para excluir cliente ID: ${id}`);
    return this.http.delete<void>(`${this.basePath}/clients/${id}`);
  }

  // Método para listar todos os clientes
  list(): Observable<ListClientResponse[]> {
    const url = `${this.basePath}/clients/listar`;
    console.log('Enviando solicitação para listar clientes na URL:', url);
    return this.http.get<ListClientResponse[]>(url);
  }

  // Método para buscar cliente por ID
  findById(id: number): Observable<DetailClientResponse> {
    const url = `${this.basePath}/clients/${id}`;
    console.log(`Enviando solicitação para buscar cliente ID: ${id}, URL: ${url}`);
    return this.http.get<DetailClientResponse>(url);
  }
}
