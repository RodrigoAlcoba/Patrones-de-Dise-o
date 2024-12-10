package org.example.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataManager {
    private static Connection conexion;

    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

    private static String usuario = "SYSTEM";
    private static String clave = "root";


    private DataManager() {
    }

    public static void generarConexion() {
        conexion = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Se encontró el driver");

            try {
                conexion = DriverManager.getConnection(url, usuario, clave);
                System.out.println("conexion creada con exito");
            } catch (SQLException sqlex) {
                System.out.println("No se pudo instanciar una conexion");
                sqlex.printStackTrace();
            }
        } catch (ClassNotFoundException cnfex) {
            System.out.println("No tienes el driver");
            cnfex.printStackTrace();
        }
    }


    public static Connection getConnection() {
        if (conexion == null) {
            generarConexion();
        }
        return conexion;
    }

}
