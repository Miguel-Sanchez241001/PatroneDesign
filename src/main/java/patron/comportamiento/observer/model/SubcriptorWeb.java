package patron.comportamiento.observer.model;

import patron.comportamiento.observer.intefaces.Observer;

public class SubcriptorWeb implements Observer {

    private Integer numeroctualizacione = 0;
    @Override
    public void update(String noticia) {
        numeroctualizacione++;
        System.out.println(this.getClass() + " actualizacion de noticias numero :" + numeroctualizacione);
        System.out.println("Sucriptores Web notificados de noticia: ".concat(noticia));
    }
}
