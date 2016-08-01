package com.designpatterns.objectpool;

/**
 * Created by mesut on 01.08.2016.
 */
public class AppOP {

    public static void main(String[] args) {
        Connection connection = DataSource.getConnection();
        Connection connection1 = DataSource.getConnection();
        Connection connection2 = DataSource.getConnection();

        //This statement will give exception because there is no enough connection
        //Connection connection3 = DataSource.getConnection();

        //Release the connection
        DataSource.releaseConnection(connection);

        //Now it will work
        Connection connection3 = DataSource.getConnection();
    }
}
