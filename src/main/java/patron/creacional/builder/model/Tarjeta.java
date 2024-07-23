package patron.creacional.builder.model;

/**
 * Clase que representa una Tarjeta bancaria con varios atributos.
 */
public class Tarjeta {
    private String tipo;
    private double limiteCredito;
    private double tasaInteres;
    private boolean tieneMantenimiento;
    private boolean permiteComprasInternet;
    private boolean permiteTransferenciasInternet;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setTieneMantenimiento(boolean tieneMantenimiento) {
        this.tieneMantenimiento = tieneMantenimiento;
    }

    public void setPermiteComprasInternet(boolean permiteComprasInternet) {
        this.permiteComprasInternet = permiteComprasInternet;
    }

    public void setPermiteTransferenciasInternet(boolean permiteTransferenciasInternet) {
        this.permiteTransferenciasInternet = permiteTransferenciasInternet;
    }

    @Override
    public String toString() {
        return "Tarjeta [tipo=" + tipo + ", limiteCredito=" + limiteCredito + ", tasaInteres=" + tasaInteres
                + ", tieneMantenimiento=" + tieneMantenimiento
                + ", permiteComprasInternet=" + permiteComprasInternet
                + ", permiteTransferenciasInternet=" + permiteTransferenciasInternet + "]";
    }
}
