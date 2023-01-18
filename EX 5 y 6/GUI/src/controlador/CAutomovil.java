package controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Automovil;

public class CAutomovil{ // C.R.U.D.


    public boolean agregar(Automovil automovil) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "INSERT INTO VEHICULO " + 
                            "(patente, marca, modelo, precioServicioNeto, " + 
                            "valorIVA,totalAPagar,litrosMaletero, cantidadPuerta) " +
                            "VALUES (?,?,?,?,?,?,?,?)";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, automovil.getPatente());
            st.setString(2, automovil.getMarca());
            st.setString(3, automovil.getModelo());
            st.setInt(4, 0);
            st.setInt(5, 0);
            st.setInt(6, 0);
            st.setInt(7, automovil.getLitrosMaleteros());
            st.setInt(8, automovil.getCantidadPuerta());
            
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(String patente) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "DELETE FROM VEHICULO WHERE patente = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, patente);
            
            st.executeUpdate();

            st.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean actualizar(Automovil automovil) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "UPDATE VEHICULO SET " 
                            + "marca = ?, "
                            + "modelo = ?, "
                            + "litrosMaletero = ?,"
                            + "cantidadPuerta = ? "
                            + "WHERE patente = ?" ;
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, automovil.getMarca());
            st.setString(2, automovil.getModelo());
            st.setInt(3, automovil.getLitrosMaleteros());
            st.setInt(4, automovil.getCantidadPuerta());
            st.setString(5, automovil.getPatente());
            
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Automovil buscarPorPatente(String patente) {
        Automovil auto = null;
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM VEHICULO WHERE PATENTE = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, patente);
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                auto = new Automovil();
                auto.setPatente(rs.getString("patente"));
                auto.setMarca(rs.getString("marca"));
                auto.setModelo(rs.getString("modelo"));
                auto.setLitrosMaleteros(rs.getInt("litrosMaletero"));
                auto.setCantidadPuerta(rs.getInt("cantidadPuerta"));
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auto;
    }

    public ArrayList<Automovil> buscarTodos() {
        ArrayList<Automovil> automoviles = new ArrayList<Automovil>();
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM VEHICULO WHERE litrosMaletero > 0  AND cantidadPuerta > 0";
        
            PreparedStatement st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Automovil auto = new Automovil();
                auto.setPatente(rs.getString("patente"));
                auto.setMarca(rs.getString("marca"));
                auto.setModelo(rs.getString("modelo"));
                auto.setLitrosMaleteros(rs.getInt("litrosMaletero"));
                auto.setCantidadPuerta(rs.getInt("cantidadPuerta"));
                automoviles.add(auto);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return automoviles;
    }


}
