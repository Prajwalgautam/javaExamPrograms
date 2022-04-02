package com.prajwal.db;
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");

            Statement st = con.createStatement();

            String sql = "INSERT INTO artists VALUES (5,'Martin Jensen','unranked')";
            st.executeUpdate(sql);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
