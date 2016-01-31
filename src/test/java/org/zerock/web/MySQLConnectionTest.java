package org.zerock.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by dw on 2016. 1. 31..
 */
public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/book_ex";
    private static final String USER = "root";
    private static final String PW = "123123";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
