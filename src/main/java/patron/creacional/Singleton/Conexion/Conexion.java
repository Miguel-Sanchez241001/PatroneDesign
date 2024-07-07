package patron.creacional.Singleton.Conexion;

public class Conexion {
    // Todos los hilos veran el valor actualizado de esta variable
    private static volatile  Conexion instanciaUnica;

    private Conexion(){
    }

    public static Conexion GetConexion(){
        if (instanciaUnica == null) {
            synchronized (Conexion.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new Conexion();
                }
            }
        }
        return instanciaUnica;

    }
    public void Conectar(){

        System.out.println("Conexion establecida");
    }
    public void Desconectar(){
        System.out.println("Desconectado");
    }

    public String GetIdInstacia(){

        return String.valueOf(instanciaUnica);
    }

}
