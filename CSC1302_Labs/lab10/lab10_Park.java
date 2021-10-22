/*
 * Vivian Do
 * ID: 002-48-6640
 * July 09, 2021
 *
 * Lab 10: Park
 * This is the Park class that will initialize the name, id, shape, and length of the parks.
 */
public class lab10_Park {
    //initializing public fields for the given variables in the prompt
    public String ParkName;
    public int ParkID;
    public String ParkShape;
    //initializing parklength as a private field
    private double ParkLength;

    //initializing the public fields with a constructor
    public lab10_Park(String ParkName, int ParkID, String ParkShape, double ParkLength) {
        //initializing parkname and parkshape as String, parkid as int, and parklength as double
        this.ParkName = ParkName;
        this.ParkID = ParkID;
        this.ParkLength = ParkLength;
        //if else loop to check if the shape is circle or square
        if(ParkShape == "Circle" || ParkShape == "Square") {
            this.ParkShape = ParkShape;
        }
        else { //will print this out if shape is neither circle or square
            System.out.println("ERROR! Invalid shape input.");
            return;
        }
    }

    //method to return park name
    public String ParkNameGetter() {
        return ParkName;
    }
    //method to return park id
    public int ParkIDGetter() {
        return ParkID;
    }
    //method to return park length
    public double ParkLengthGetter() {
        return ParkLength;
    }
}
