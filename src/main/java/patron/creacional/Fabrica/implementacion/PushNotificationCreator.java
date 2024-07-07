package patron.creacional.Fabrica.implementacion;

import patron.creacional.Fabrica.interfaces.Notificacion;
import patron.creacional.Fabrica.interfaces.NotificacionCreator;
import patron.creacional.Fabrica.model.Push;

public class PushNotificationCreator extends NotificacionCreator {
    @Override
    public Notificacion createNotification() {
        return new Push("");
    }
}
