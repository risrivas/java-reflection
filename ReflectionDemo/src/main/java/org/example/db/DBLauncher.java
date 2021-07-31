package org.example.db;

import org.h2.tools.Server;

import java.sql.SQLException;

/**
 * Created by rishi on 31/07/2021
 */
public class DBLauncher {

    public static void main(String[] args) throws SQLException {
        Server.main();
        System.out.println("DB Launched");
    }

}
