package com.bptn.course._week_6_il_coding_6_1;

import java.sql.*;

public class FeedAppClass {
    private static final String userName = "postgres";
    private static final String password = "pg123";
    private static final String dbname = "feedApp";
    private static final String port = "5432";
    private static final String dbUrl = "localhost";

    public Connection createConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbname, userName, password);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return conn;
    }

    public void addUser(Connection conn, String firstName, String lastName, String username, String phone, String emailId, String password, boolean emailVerified) {
        try {
            PreparedStatement stmt = null;
            String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, username);
            stmt.setString(4, phone);
            stmt.setString(5, emailId);
            stmt.setString(6, password);
            stmt.setBoolean(7, emailVerified);
            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            stmt.close();
        } catch (SQLException ex) {
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
        }
    }

    public boolean closeConnection(Connection conn) {
        boolean flag = true;
        try {
            conn.close();
        } catch (SQLException ex) {
            flag = false;
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
        }
        return flag;
    }
}
