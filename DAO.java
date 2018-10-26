package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAO {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastropessoa";
    private static final String DRIVER = "com.mysql.jdbc.Driver";  
    private static final String USER = "root"; 
    private static final String PASS = ""; 
    
    
    public static Connection getConexao() throws Exception{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch (ClassNotFoundException | SQLException e){
            throw new Exception("Erro na conexão com o banco: \n" + e.getMessage());
        }
    }
    public static void closeConexao(Connection con, PreparedStatement stmt){
        try {
            if(con != null){
                con.close();
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Algum erro ocorreu!");
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    public static void closeConexao(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConexao(con, stmt);
        
        try{
            if(rs != null){
                rs.close();
            }
        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Algum erro ocorreu de novo!");
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
        
          
    
       
        
        
        
            

