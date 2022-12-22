package VehicalReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    int id;
    String passengerName;
    long PhoneNum;
    int vechicalNumber;
    Date date;

    public Booking() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name of Passenger: ");
        passengerName = in.next();
        System.out.println("Enter Phone number: ");
        PhoneNum=in.nextLong();
        System.out.println("Enter vechical Number: ");
        vechicalNumber = in.nextInt();
        System.out.println("Enter Date DD-MM-YYYY");
        String dateInput = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            //To Do Autogenerate Catch
            // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws Exception {

        VehicalDAO V=new VehicalDAO();
        BookingDAO B=new BookingDAO();
        int capacity = V.getCapacity(vechicalNumber);

        int booked =B.getBookedCount(vechicalNumber,date);

        return booked<capacity;
    }
}
