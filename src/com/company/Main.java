package com.company;

import java.sql.*;

public class Main {

    private static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/miniDepOrph", "devAdem", "Shangquan1!");
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM orphan");
            ResultSet resultSet = statement.getResultSet();

//            while (resultSet.next()){
//                System.out.println(resultSet.getString(2));
//                System.out.println(resultSet.getString(7));
//            }

            resultSet.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
