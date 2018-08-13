/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Niharika
 */
public class connector {
    public static Connection getConnection() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection cn=(Connection)
                DriverManager.getConnection("jdbc:derby://localhost:1527/jsw","jsw","jsw");
        
    
    return cn;
    }
}
