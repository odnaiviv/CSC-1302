/*
 * July 16, 2021
 *
 * Lab 12: Lab11 (not sure why main/client class is called Lab11 lol)
 */
public class lab12_Lab11 {
    public static void main(String[] args){
        //creating object of Cat class
        //cat has these four attributes: not vegetarian, eats meats, four legs, and white color
        lab12_Cat cat = new lab12_Cat(false, "meat", 4, "white");

        //printing the four attributes for the cat by calling the method in the Animal superclass and Cat subclass
        //cat is not vegetarian
        System.out.println("Cat is Vegetarian? " + cat.isVegetarian());
        //cat eats meat
        System.out.println("Cat eats " + cat.getEats() + ".");
        //cat has for legs
        System.out.println("Cat has " + cat.getNumLegs() + " legs.");
        //cat is white
        System.out.println("Cat color is " + cat.getColor() + ".");
    }
}
