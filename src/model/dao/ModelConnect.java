package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ModelConnect{
    
    private static final String user = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbsalon";
    
    public static Connection getConectar(){
        
        Connection con = null;
        
        try{
            con = DriverManager.getConnection(url,user,senha);
            return con;
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, 
                                          "Erro ao se conectar ao banco de dados"
                                           + ex.getMessage());
            return null;
        }
        
        
        
    }
}