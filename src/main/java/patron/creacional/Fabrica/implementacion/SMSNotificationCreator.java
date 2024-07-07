package patron.creacional.Fabrica.implementacion;

import patron.creacional.Fabrica.interfaces.Notificacion;
import patron.creacional.Fabrica.interfaces.NotificacionCreator;
import patron.creacional.Fabrica.model.SMS;

public class SMSNotificationCreator extends NotificacionCreator {
    @Override
    public Notificacion createNotification() {
        return new SMS("");
    }
}
