package com.prajwal.db;

import java.sql.*;

public class ReadDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from artists");
            System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"\t"+"Rank");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
