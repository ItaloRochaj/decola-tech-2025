import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AboutService {
  private aboutData = {
    title: 'Sobre Nós',
    description: 'Bem-vindo ao Tech Blog! Aqui você encontrará as últimas notícias, tutoriais e análises sobre tecnologia. Somos uma equipe apaixonada por tecnologia e inovação. Nossa missão é compartilhar conhecimento e manter nossos leitores informados sobre as tendências e inovações tecnológicas.',
    contact: 'Para mais informações, entre em contato conosco através do email: ',
  team: [
      { text: 'Nosso time é composto por especialistas apaixonados por tecnologia, prontos para trazer o melhor conteúdo para você.' },
      { name: 'Italo Rocha', role: 'CEO' },
      { name: 'Carlos Oliveira', role: 'CTO' },
      { name: 'Mariana Souza', role: 'Desenvolvedora' }
    ]
  };

  getAboutData() {
    return this.aboutData;
  }
}
