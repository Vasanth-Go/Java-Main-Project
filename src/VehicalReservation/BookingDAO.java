package VehicalReservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingDAO {

    // Booking Data Access Object....
    public int getBookedCount(int vechicalNumber, java.util.Date date) throws SQLException {

        String query="select count(passengerName) from Booking where vechicalNumber=? and date=? ";
        Connection con = Dbconnection.getconnection();
        PreparedStatement pst=con.prepareStatement(query);

        java.sql.Date sqldate= new java.sql.Date(date.getTime());

        pst.setInt(1,vechicalNumber);
        pst.setDate(2,sqldate);
        ResultSet rs=pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public  void addBooking(Booking booking) throws SQLException {
        String query="Insert into booking values(?,?,?,?,?)";
        Connection con=Dbconnection.getconnection();
        java.sql.Date sqldate= new java.sql.Date(booking.date.getTime());


        PreparedStatement pst= con.prepareStatement(query);
        pst.setInt(1,booking.id);
        pst.setString(2, booking.passengerName);
        pst.setLong(3,booking.PhoneNum);
        pst.setInt(4,booking.vechicalNumber);
        pst.setDate(5,sqldate);

        pst.executeUpdate();

    }
}
