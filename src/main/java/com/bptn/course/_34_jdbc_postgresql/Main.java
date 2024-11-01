package com.bptn.course._34_jdbc_postgresql;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ToDoListClass jdbc = new ToDoListClass();
        Connection conn = jdbc.createConnection();
        jdbc.getAllUsers(conn);
        jdbc.closeConnection(conn);
    }
}
