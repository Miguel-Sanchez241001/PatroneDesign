package patron.comportamiento.observer.implementacion;

import patron.comportamiento.observer.intefaces.Observer;
import patron.comportamiento.observer.intefaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Subject {

    private String noticia;
   private List<Observer> observadores ;

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        notifyObservers();
    }

    public CanalNoticias(){
       observadores = new ArrayList<>();
   }
    @Override
    public void registerObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observador: observadores){
            observador.update(noticia);
        }
    }
}
