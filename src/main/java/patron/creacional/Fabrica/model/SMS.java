package patron.creacional.Fabrica.model;

import patron.creacional.Fabrica.interfaces.Notificacion;

public class SMS extends Notificacion {
    public SMS(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Enviando Mensaje por SMS");

    }

    @Override
    public String verMensaje() {
        return "Notificacion: SMS Mensaje: ".concat(getMessage());

    }
}
