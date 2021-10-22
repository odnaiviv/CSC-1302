/*
 * July 16, 2021
 *
 * Lab 12: Animal
 */
public class lab12_Animal {
    //initializing private variables
    private boolean vegetarian;
    private String eats;
    private int NumLegs;

    //initializing private variables with constructor
    public lab12_Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.NumLegs = legs;
    }

    //methods to get constructors
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNumLegs() {
        return NumLegs;
    }
    //methods to set constructors
    public void setVegetarian(boolean veg) {
        this.vegetarian = veg;
    }
    public void setEats(String food) {
        this.eats = food;
    }
    public void setNumLegs(int legs) {
        this.NumLegs = legs;
    }
}
