package com.designpatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 01.08.2016.
 */
public class DataSource {
    private static DataSource dataSource = new DataSource();
    List<Connection> connections = new ArrayList<Connection>();

    private DataSource(){
        init();
    }

    private void init() {
        for (int i = 0; i < 3; i++) {
            connections.add(new Connection());
        }
    }

    public static Connection getConnection() {
        if (dataSource.connections.size() == 0) {
            throw new RuntimeException("No Connection Exception!");
        }
        Connection connection = dataSource.connections.get(0);
        dataSource.connections.remove(0);
        System.out.println(connection);
        return connection;
    }

    static void releaseConnection(Connection connection) {
        if (connection != null)
            dataSource.connections.add(connection);
    }


}
