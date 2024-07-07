package patron.creacional.Fabrica.interfaces;

public abstract class Notificacion {

    private String message;
    public abstract  void send();

    public abstract String verMensaje();

    public Notificacion( String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
