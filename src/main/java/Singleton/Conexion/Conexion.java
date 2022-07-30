package Singleton.Conexion;

public class Conexion {
    private static Conexion conexion;

    private Conexion(){
    }

    public static Conexion GetConexion(){
        if (conexion == null) {
            conexion = new Conexion();
        }

        return conexion;
    }
    public void Conectar(){

        System.out.println("Conexion establecida");
    }
    public void Desconectar(){
        System.out.println("Desconectado");
    }

    public String GetIdInstacia(){

        return String.valueOf(conexion);
    }

}
