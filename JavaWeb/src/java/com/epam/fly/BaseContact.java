package com.epam.fly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BaseContact {
    
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver found");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found:" + ex);
        }
        
        String url="jdbc:mysql://localhost/flights";
        String user = "root";
        String password=""; //need write pass
        Connection con = null;
        
        try {
            con =  DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully"+"\n");
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from flight" );
            //ResultSet Planename = st.executeQuery("select name * from plane");
            System.out.println("name  -  arrival  -  departure  -  time");
            System.out.println("------------------------------------------");
            while(rs.next())
            {
                    //System.out.println(NamePlane.getString("name"));
                    System.out.println( rs.getString("arrival")+ " - " 
                            +rs.getString("departure"));
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        finally{
               //Закрытие соединения
               try {
                    if(con != null)
                    con.close();
               } catch (SQLException e) {
                    e.printStackTrace();
               }
          }
    }
    
}
