package controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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


    public boolean eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                            + "WHERE idVehiculo = ?" ;
        
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


    public Automovil buscarPorId(int id) {
        Automovil auto = null;
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM VEHICULO WHERE IDVEHICULO = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id);
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



}
