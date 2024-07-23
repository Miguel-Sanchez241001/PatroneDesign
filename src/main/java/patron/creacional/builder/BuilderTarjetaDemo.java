package patron.creacional.builder;

import patron.creacional.builder.impl.ConstructorTarjetaCredito;
import patron.creacional.builder.impl.ConstructorTarjetaDebito;
import patron.creacional.builder.interfaz.ConstructorTarjeta;
import patron.creacional.builder.model.Tarjeta;

/**
 * Clase de demostración para el patrón Builder aplicado a Tarjetas.
 */
public class BuilderTarjetaDemo {
    public static void main(String[] args) {
        Director director = new Director();

        ConstructorTarjeta credito = new ConstructorTarjetaCredito();
        ConstructorTarjeta debito = new ConstructorTarjetaDebito();

        director.setConstructorTarjeta(credito);
        Tarjeta tarjetaCredito = director.construirTarjeta();
        System.out.println(tarjetaCredito); // Output: Tarjeta [tipo=Tarjeta de Crédito, limiteCredito=5000, tasaInteres=15.5, tieneMantenimiento=true, permiteTransferenciasInternet=true, permiteComprasInternet=true]

        director.setConstructorTarjeta(debito);
        Tarjeta tarjetaDebito = director.construirTarjeta();
        System.out.println(tarjetaDebito); // Output: Tarjeta [tipo=Tarjeta de Débito, limiteCredito=0, tasaInteres=0, tieneMantenimiento=false, permiteTransferenciasInternet=true, permiteComprasInternet=true]
    }
}