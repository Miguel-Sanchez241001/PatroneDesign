package patron.creacional.Fabrica.interfaces;

public abstract class NotificacionCreator {

    public abstract Notificacion createNotification();

    public void verMensaje() {

        Notificacion mensaje = createNotification();
        System.out.println(mensaje.verMensaje());

    }
}
