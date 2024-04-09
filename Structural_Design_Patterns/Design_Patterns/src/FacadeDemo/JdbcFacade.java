package FacadeDemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() throws SQLException {
        int count = 0;

        try {
            Connection conn = instance.getConnection();

            //Fist we create a Table
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
                    + "VARCHAR(20), City VARCHAR(20))");

            sta.close();
//            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Count is: " + count);
        return count;
    }

    public int insertIntoTable() {
        int count = 0;

        try {
            Connection conn = instance.getConnection();

            //Then we insert records
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
                    + "values (1, '1234 Some street', 'Layton')");

            sta.close();
//            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Count is: " + count);
        return count;
    }

    public List<Address> getAddresses() {

        //create a new list of Addresses
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();

            //Lastly we select records back from the database
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                //We create an Address object
                Address address = new Address(rs.getString(1), rs.getString(2), rs.getString(3));


            }
            rs.close();
            sta.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return addresses;
    }
}

//Java record object
record Address (String id, String streetName, String city) {}
