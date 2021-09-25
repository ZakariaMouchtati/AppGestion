/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Connect {
      public static Connection seconnenter() throws Exception{
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bang","2020");
        return con;
        }catch(ClassNotFoundException | SQLException ex){
        throw new Exception("inpossible de connecter"+ex.getMessage());
    }
    
        }
    
}
