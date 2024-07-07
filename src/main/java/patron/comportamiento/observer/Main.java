package patron.comportamiento.observer;

import patron.comportamiento.observer.implementacion.CanalNoticias;
import patron.comportamiento.observer.intefaces.Observer;
import patron.comportamiento.observer.intefaces.Subject;
import patron.comportamiento.observer.model.SubcriptorEmail;
import patron.comportamiento.observer.model.SubcriptorMovil;
import patron.comportamiento.observer.model.SubcriptorWeb;

public class Main {

//    Escenario: Sistema de Noticias
//    Descripción: Implementa un sistema de suscripción a noticias.
//    Los usuarios pueden suscribirse a diferentes canales de noticias
//            (por ejemplo, deportes, tecnología, política).
//    Cuando hay una nueva noticia en un canal, todos los
//    suscriptores de ese canal deben ser notificados automáticamente.
    public static void main(String[] args) {
        Observer observadorEmail = new SubcriptorEmail();
        Observer observadorMovil = new SubcriptorMovil();
        Observer observadorWeb = new SubcriptorWeb();
        CanalNoticias canalNoticia = new CanalNoticias();
        canalNoticia.registerObserver(observadorEmail);
        canalNoticia.registerObserver(observadorMovil);
        canalNoticia.setNoticia("Se declaro la paz entre argentina y chile");
        canalNoticia.registerObserver(observadorWeb);
        canalNoticia.setNoticia("Se venden peces en el rio nilo");

    }
}
