package patron.creacional.builder.impl;

import patron.creacional.builder.interfaz.ConstructorTarjeta;

public class ConstructorTarjetaDebito extends ConstructorTarjeta {
    @Override
    public void construirTipo() {
        tarjeta.setTipo("Tarjeta de Débito");
    }

    @Override
    public void construirLimiteCredito() {
        tarjeta.setLimiteCredito(0); // No hay límite de crédito
    }

    @Override
    public void construirTasaInteres() {
        tarjeta.setTasaInteres(0); // No hay interés
    }

    @Override
    public void construirMantenimiento() {
        tarjeta.setTieneMantenimiento(false); // No tiene mantenimiento
    }

    @Override
    public void construirTransferenciasInternet() {
        tarjeta.setPermiteTransferenciasInternet(true); // Permite transferencias por Internet
    }

    @Override
    public void construirComprasInternet() {
        tarjeta.setPermiteComprasInternet(true); // Permite compras por Internet
    }
}