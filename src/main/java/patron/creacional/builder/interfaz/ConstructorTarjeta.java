package patron.creacional.builder.interfaz;

import patron.creacional.builder.model.Tarjeta;

/**
 * Clase abstracta para construir una Tarjeta bancaria.
 */
public abstract class ConstructorTarjeta {
    protected Tarjeta tarjeta;

    /**
     * Crea una nueva instancia de Tarjeta.
     */
    public void crearNuevaTarjeta() {
        tarjeta = new Tarjeta();
    }

    /**
     * Devuelve la Tarjeta construida.
     * @return La Tarjeta construida.
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public abstract void construirTipo();
    public abstract void construirLimiteCredito();
    public abstract void construirTasaInteres();
    public abstract void construirMantenimiento();
    public abstract void construirComprasInternet();
    public abstract void construirTransferenciasInternet();
}
