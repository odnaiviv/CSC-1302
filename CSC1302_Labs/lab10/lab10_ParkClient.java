/*
 * Vivian Do
 * ID: 002-48-6640
 * July 09, 2021
 *
 * Lab 10: Park Client
 * This is the Park Client class that will set up the parks, giving it their names, IDs, shape type, and length. This
 * class will put the parks we've created into an array. By using loops, we will determine which park is the largest out
 * of the five parks we've created, and will print out the results of the largest park.
 */
public class lab10_ParkClient {
    public static void main(String[] args){
        //initializing parks with their names, ids, shapes, and length
        lab10_Park park1 = new lab10_Park("CSC1302", 40, "Circle", 5);
        lab10_Park park2 = new lab10_Park("CSC1302", 40 + 3, "Square", 6);
        //for these next three parks, prompt is said to set the parks randomly
        //park name will not change, park id will continue to add by 3 from last park, park shape will be swapping shapes, and park length will be randomly picked from a number generate (1 - 10)
        lab10_Park park3 = new lab10_Park("CSC1302", 40 + 6, "Circle", 10);
        lab10_Park park4 = new lab10_Park("CSC1302", 40 + 9, "Square", 8);
        lab10_Park park5 = new lab10_Park("CSC1302", 40 + 12, "Circle", 2);

        //putting all of the park objects into the elements of an array
        lab10_Park ParkArray[] = {park1, park2, park3, park4, park5};

        //temporary storing index for the largest park in the array
        int tempPark = 0;
        //for loop to find the park with the largest length
        for (int i = 0; i < ParkArray.length; i++) {
            //if statement to find the largest park length value and replaces the index with the largest park length value (i)
            if (ParkArray[i].ParkLengthGetter() > ParkArray[tempPark].ParkLengthGetter()) {
                tempPark = i;
            }
        }

        //initializing largePark by putting the temporary park value i into the park array
        lab10_Park largePark = ParkArray[tempPark];
        //prints the results of the largest park from all parks
        System.out.println("Name of Park: " + largePark.ParkNameGetter());
        System.out.println("ID of Park: " + largePark.ParkIDGetter());
        System.out.println("Shape of Park: " + largePark.ParkShape);
        System.out.println("Length of Park: " + largePark.ParkLengthGetter());
    }
}
