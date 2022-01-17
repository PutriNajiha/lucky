
package project;

import java.sql.*;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[]args){
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //st.executeUpdate("create table users(name varchar(200), email varchar(200),userID varchar(20),password varchar(50),securityQuestion varchar(500), answer varchar(200), address varchar(200), status varchar(20))");
            //st.executeUpdate("create table booking(id int,userID varchar(20), roomID varchar(20), price double,checkIN varchar(50),checkOut varchar(50),days varchar(50))");
            st.executeUpdate("create table review(Num int,roomID varchar(20), rating double,comment varchar(200))");
            JOptionPane.showMessageDialog(null,"Table created Successfully");
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        { }
        }
    }
}
