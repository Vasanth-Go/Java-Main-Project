package VehicalReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private static final String url="jdbc:mysql://Localhost:3306/VehicalAgency";
    private static final String userName="root";
    private static final String password="**********";

    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}
