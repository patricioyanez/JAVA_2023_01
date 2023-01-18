
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection obtenerConexion() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automotora", "root", "");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Error. Al parecer falta: " + ex.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.obtenerConexion();
    }
    
}
