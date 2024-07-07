package patron.creacional.Fabrica.model;

import patron.creacional.Fabrica.interfaces.Notificacion;

public class Push extends Notificacion {
    public Push(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Enviando Mensaje por PUSH");
    }

    @Override
    public String verMensaje() {
        return "Notificacion: Push Mensaje: ".concat(getMessage());
    }
}
