package patron.creacional.builder;

import patron.creacional.builder.interfaz.ConstructorTarjeta;
import patron.creacional.builder.model.Tarjeta;

/**
 * Director que gestiona la construcción de Tarjetas.
 */
public class Director {
    private ConstructorTarjeta constructorTarjeta;

    /**
     * Establece el constructor de tarjetas que se utilizará para construir una tarjeta.
     *
     * @param constructorTarjeta El constructor de tarjetas.
     */
    public void setConstructorTarjeta(ConstructorTarjeta constructorTarjeta) {
        this.constructorTarjeta = constructorTarjeta;
    }

    /**
     * Construye una nueva tarjeta utilizando el constructor de tarjetas actual.
     *
     * @return La tarjeta construida.
     */
    public Tarjeta construirTarjeta() {
        constructorTarjeta.crearNuevaTarjeta();
        constructorTarjeta.construirTipo();
        constructorTarjeta.construirLimiteCredito();
        constructorTarjeta.construirTasaInteres();
        constructorTarjeta.construirMantenimiento();
        constructorTarjeta.construirTransferenciasInternet();
        constructorTarjeta.construirComprasInternet();
        return constructorTarjeta.getTarjeta();
    }

    /**
     * Construye una tarjeta pendiente con características específicas.
     *
     * @return La tarjeta pendiente construida.
     */
    public Tarjeta construirTarjetaPendiente() {
        constructorTarjeta.crearNuevaTarjeta();
        constructorTarjeta.construirTipo(); // Podría ser específico para tarjetas pendientes
        constructorTarjeta.construirLimiteCredito(); // Sin límite para tarjetas pendientes
        constructorTarjeta.construirTasaInteres(); // Sin tasa para tarjetas pendientes
        // Omite algunos pasos o añade otros específicos para tarjetas pendientes
        return constructorTarjeta.getTarjeta();
    }
}



