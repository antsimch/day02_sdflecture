package sg.edu.nus.iss;

public class RoadBike extends Bicycle {
    private int seatHeight;

    public RoadBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public RoadBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nseatHeight=" + seatHeight + "\n";
    }
}
