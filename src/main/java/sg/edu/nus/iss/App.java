package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MountainBike mountainBike = new MountainBike(5, 10, 20);
        MountainBike mountainBike2 = new MountainBike(3, 5, 25);
        MountainBike mountainBike3 = new MountainBike(5, 15, 15);

        RoadBike roadBike = new RoadBike(15, 30, 25);

        System.out.println(mountainBike.toString());

        List<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        // for (Bicycle bike : bicycles) {
        //     System.out.println(bike.toString());
        // }

        System.out.println(bicycles.toString());
        
        for (Bicycle bicycle : bicycles) {
            if (bicycle instanceof MountainBike) {
                System.out.println(bicycle.hashCode() + " is a Mountain Bike");
            } else if (bicycle instanceof RoadBike) {
                System.out.println(bicycle.hashCode() + " is a Road Bike");
            }
        }
    }
}
