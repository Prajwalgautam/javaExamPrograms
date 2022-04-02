package com.prajwal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Scanner sc = new Scanner (System.in);
            System.out.println ("enter artists id no\n");
            int id = sc.nextInt ();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");

            Statement st = con.createStatement();
            int row = st.executeUpdate ("delete from artists where id = " +id);
            if (row == 0)
                System.out.println ("artist does not exist");
            else
                System.out.println ("artist removed successfully");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
