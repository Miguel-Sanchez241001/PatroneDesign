package patron.creacional.Fabrica.model;

import patron.creacional.Fabrica.interfaces.Notificacion;

public class Email extends Notificacion {


    public Email(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Enviando Mensaje por Email");

    }

    @Override
    public String verMensaje() {
        return "Notificacion: Email Mensaje: ".concat(getMessage());
    }
}
