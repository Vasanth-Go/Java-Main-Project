package VehicalReservation;

public class Vehicals {
    private  int vechicalNumber;
    private String VechicalType;     //get & set method can only access private variable.
    private int SeatCapacity;     //get & set method can only access private variable.
    private  int capacity;

    private int RentPerDay;  //get & set method can only access private variable.

    public Vehicals(int vechicalNumber, String VechicalType, int SeatCapacity,int capacity, int RentPerDay){
        this.vechicalNumber=vechicalNumber;
        this.VechicalType=VechicalType;
        this.SeatCapacity=SeatCapacity;
        this.capacity=capacity;
        this.RentPerDay=RentPerDay;
    }

    public int getVechicalNumber() {
        return vechicalNumber;
    }

    public String getVechicalType() {
        return VechicalType;
    }

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRentPerDay() {
        return RentPerDay;
    }

    public void setVechicalType(String vechicalType) {
        VechicalType = vechicalType;
    }

    public void setVechicalNumber(int vechicalNumber) {
        this.vechicalNumber = vechicalNumber;
    }

    public void setSeatCapacity(int seatCapacity) {
        SeatCapacity = seatCapacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRentPerDay(int rentPerDay) {
        RentPerDay = rentPerDay;
    }



}
