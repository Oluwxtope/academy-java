package com.bptn.course._34_jdbc_postgresql;

import java.sql.*;

public class ToDoListClass {
    private static final String userName = "postgres";
    private static final String password = "pg123";
    private static final String dbname = "todolist";
    private static final String port = "5432";
    private static final String dbUrl = "localhost";

    public Connection createConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbname, userName, password);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Connected to DB!");
        return conn;
    }

    public void getAllUsers(Connection conn) {
        try {
            Statement myStatement = conn.createStatement();
            String myQuery = "SELECT * FROM \"users\"";
            ResultSet rs = myStatement.executeQuery(myQuery);
            while (rs.next()) {
                System.out.println("User Id: " + rs.getInt("userId") + "\t");
                System.out.println("User Name: " + rs.getString("username") + "\t");
                System.out.println("Email: " + rs.getString("email") + "\t");
                System.out.println("Created At: " + rs.getString("createdAt") + "\t");
                System.out.println();
            }
            myStatement.close();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void getTaskByDate(Connection conn, String dueDate) {
        try {
            Statement myStatement = conn.createStatement();
            String myQuery = "SELECT * FROM tasks WHERE \"dueDate\" = " + "'" + dueDate + "'";
            ResultSet rs = myStatement.executeQuery(myQuery);
            while (rs.next()) {
                System.out.print("Task Description: " + rs.getString("taskDescription"));
                System.out.println();
            }
            myStatement.close();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public boolean closeConnection(Connection conn) {
        boolean flag = true;
        try {
            conn.close();
        } catch (SQLException e) {
            flag = false;
            System.out.println("Exception: " + e.getMessage());
        }
        return flag;
    }
}
