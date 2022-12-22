package VehicalReservation;

import java.util.Scanner;

public class vechicalDemo {
    public static void main(String[] args)  {

        VehicalDAO vehicalDAO = new VehicalDAO();

        try {
            vehicalDAO.displayvehicalInformation();

            int userOption = 1;
            Scanner in = new Scanner(System.in);

            while (userOption == 1) {
                System.out.println("Enter 1 to Book and 2 to Exit ");
                userOption = in.nextInt();
                if (userOption == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable()) {
                        BookingDAO bookingDAO = new BookingDAO();
                        bookingDAO.addBooking(booking);
                        System.out.println("Your booking is conformed....");
                    } else
                        System.out.println("Sorry Booking is full Choose Another Date & Vehical");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
