package org.example;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {

        Connection con = DatabaseManager.getConnection();

        System.out.println(con);
        try{
            if (con !=null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
