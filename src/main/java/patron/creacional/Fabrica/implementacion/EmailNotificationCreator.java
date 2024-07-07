package patron.creacional.Fabrica.implementacion;


import patron.creacional.Fabrica.interfaces.Notificacion;
import patron.creacional.Fabrica.interfaces.NotificacionCreator;
import patron.creacional.Fabrica.model.Email;

public class EmailNotificationCreator extends NotificacionCreator {
    @Override
    public Notificacion createNotification() {
        return new Email("");
    }
}
