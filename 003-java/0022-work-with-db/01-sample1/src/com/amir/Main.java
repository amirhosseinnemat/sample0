package com.amir;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Amir1995");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");


        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " *** " + resultSet.getString(2));
        }

    }
}
