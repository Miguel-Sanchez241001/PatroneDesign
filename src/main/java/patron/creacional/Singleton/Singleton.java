package patron.creacional.Singleton;

import patron.creacional.Singleton.Conexion.Conexion;

public class Singleton {
    public static  void main(String[] args) {
        Conexion conec = Conexion.GetConexion();
        conec.Conectar();
        System.out.println(conec);
        Conexion conec2 = Conexion.GetConexion();
        conec2.Conectar();
        System.out.println(conec2);
        Conexion conec3 = Conexion.GetConexion();
        conec3.Conectar();
        System.out.println(conec3);
    }
}
