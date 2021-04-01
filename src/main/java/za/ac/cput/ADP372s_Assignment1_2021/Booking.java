package za.ac.cput.ADP372s_Assignment1_2021;
/*
@author Mawande Langa 219074054
@date 01 April 2021
@Task ADP3 asssignment 1
 */

public class Booking {
    private String bookingId;
    private  String bookingName;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingName='" + bookingName + '\'' +
                '}';
    }
}
