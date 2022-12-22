package VehicalReservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehicalDAO {
    //vehical Data Access Object
    public void displayvehicalInformation() throws SQLException {
        String query=" Select * from vehical";
        Connection con= Dbconnection.getconnection();
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);

        while (rs.next()){
            System.out.println("vechical Number: "+rs.getInt(1));
            System.out.println("Vechical Type: "+rs.getString(2));
            System.out.println("Seat Capacity: "+rs.getInt(3));
            System.out.println("Vehical capacity: "+rs.getInt(4));
            System.out.println("RentPerDay: "+rs.getInt(5));
            System.out.println("-------");

        }
        System.out.println("----------------------------------------------");
    }
    public  int getCapacity(int vechicalNumber) throws Exception{
        String query="select capacity from vehical where vechicalNumber="+vechicalNumber;
        Connection con=Dbconnection.getconnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
