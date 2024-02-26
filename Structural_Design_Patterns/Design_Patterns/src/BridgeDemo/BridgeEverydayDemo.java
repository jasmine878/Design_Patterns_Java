package BridgeDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//We're using the JDBC Api to create a database table in an H2 database
//The Abstraction in this example is the Client
public class BridgeEverydayDemo {

        public static void main(String args[]) {
                try {
                        //We register our Driver
                        DriverManager.registerDriver(new org.h2.Driver());

                        //Then we build our url which builds our database for us since we're using H2 which is an embeddable Java SQL database
                        //Then we use the Driver Manager to get our connection
                        Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/bridge", "sa", "");

                        //Then we create our statement
                        Statement sta = conn.createStatement();

                        //And execute our statement
                        sta.executeUpdate("CREATE TABLE Address(ID INT, STREET_NAME VARCHAR(20), CITY VARCHAR(20))");

                        //We print a log to let us know that a Table has been created
                        System.out.println("Table created");
                } catch(SQLException ex) {
                        ex.printStackTrace();
                }
        }
}