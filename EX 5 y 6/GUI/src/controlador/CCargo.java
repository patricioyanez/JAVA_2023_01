package controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cargo;
import java.util.Vector;

public class CCargo{ // C.R.U.D.


    public boolean agregar(Cargo cargo) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "INSERT INTO CARGO (nombre) " +
                            "VALUES (?)";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, cargo.getNombre());
            
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(int id) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "DELETE FROM CARGO WHERE idCargo = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id);
            
            st.executeUpdate();

            st.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean actualizar(Cargo cargo) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "UPDATE CARGO SET " 
                            + "nombre = ? "
                            + "WHERE idCargo = ?" ;
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, cargo.getNombre());
            st.setInt(2, cargo.getId());
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Cargo buscarPorId(int id) {
        Cargo cargo = null;
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM CARGO WHERE idCargo = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                cargo = new Cargo();
                cargo.setId(rs.getInt("idCargo"));
                cargo.setNombre(rs.getString("nombre"));
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargo;
    }

    public ArrayList<Cargo> buscarTodos() {
        ArrayList<Cargo> cargos = new ArrayList<Cargo>();
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM CARGO ";
        
            PreparedStatement st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("idCargo"));
                cargo.setNombre(rs.getString("nombre"));
                cargos.add(cargo);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargos;
    }
    
    public Vector cargarCombo() {
        Vector items = new Vector();
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM CARGO ";
        
            PreparedStatement st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("idCargo"));
                cargo.setNombre(rs.getString("nombre"));
                items.add(cargo);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
}
