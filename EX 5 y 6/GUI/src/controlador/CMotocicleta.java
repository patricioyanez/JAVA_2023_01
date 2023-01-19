package controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Motocicleta;

public class CMotocicleta{ // C.R.U.D.


    public boolean agregar(Motocicleta motocicleta) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "INSERT INTO VEHICULO " + 
                            "(patente, marca, modelo, precioServicioNeto, " + 
                            "valorIVA,totalAPagar,largoManillar, estilo) " +
                            "VALUES (?,?,?,?,?,?,?,?)";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, motocicleta.getPatente());
            st.setString(2, motocicleta.getMarca());
            st.setString(3, motocicleta.getModelo());
            st.setInt(4, 0);
            st.setInt(5, 0);
            st.setInt(6, 0);
            st.setInt(7, motocicleta.getLargoManillar());
            st.setString(8, motocicleta.getEstilo());
            
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean actualizar(Motocicleta motocicleta) {
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "UPDATE VEHICULO SET " 
                            + "marca = ?, "
                            + "modelo = ?, "
                            + "largoManillar = ?,"
                            + "estilo = ? "
                            + "WHERE patente = ?" ;
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, motocicleta.getMarca());
            st.setString(2, motocicleta.getModelo());
            st.setInt(3, motocicleta.getLargoManillar());
            st.setString(4, motocicleta.getEstilo());
            st.setString(5, motocicleta.getPatente());
            
            st.executeUpdate();
            st.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Motocicleta buscarPorPatente(String patente) {
        Motocicleta motocicleta = null;
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM VEHICULO WHERE PATENTE = ?";
        
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, patente);
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                motocicleta = new Motocicleta();
                motocicleta.setPatente(rs.getString("patente"));
                motocicleta.setMarca(rs.getString("marca"));
                motocicleta.setModelo(rs.getString("modelo"));
                motocicleta.setLargoManillar(rs.getInt("largoManillar"));
                motocicleta.setEstilo(rs.getString("estilo"));
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motocicleta;
    }

    public ArrayList<Motocicleta> buscarTodos() {
        ArrayList<Motocicleta> motocicletas = new ArrayList<Motocicleta>();
        try {
            Conexion c = new Conexion();
            Connection con = c.obtenerConexion();
        
            String query = "SELECT * FROM VEHICULO WHERE largoManillar > 0  AND estilo <> ''";
        
            PreparedStatement st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Motocicleta motocicleta = new Motocicleta();
                motocicleta.setPatente(rs.getString("patente"));
                motocicleta.setMarca(rs.getString("marca"));
                motocicleta.setModelo(rs.getString("modelo"));
                motocicleta.setLargoManillar(rs.getInt("largoManillar"));
                motocicleta.setEstilo(rs.getString("estilo"));
                motocicletas.add(motocicleta);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motocicletas;
    }

}
