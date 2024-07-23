package patron.creacional.builder.impl;

import patron.creacional.builder.interfaz.ConstructorTarjeta;

public /**
 * Builder concreto para construir una Tarjeta de Crédito.
 */
class ConstructorTarjetaCredito extends ConstructorTarjeta {
    @Override
    public void construirTipo() {
        tarjeta.setTipo("Tarjeta de Crédito");
    }

    @Override
    public void construirLimiteCredito() {
        tarjeta.setLimiteCredito(5000); // Límite de crédito de $5000
    }

    @Override
    public void construirTasaInteres() {
        tarjeta.setTasaInteres(15.5); // 15.5% de interés
    }

    @Override
    public void construirMantenimiento() {
        tarjeta.setTieneMantenimiento(true); // Tiene mantenimiento
    }

    @Override
    public void construirComprasInternet() {
        tarjeta.setPermiteComprasInternet(true); // Permite compras por Internet
    }

    @Override
    public void construirTransferenciasInternet() {
        tarjeta.setPermiteTransferenciasInternet(true); // Permite transferencias por Internet
    }
}

