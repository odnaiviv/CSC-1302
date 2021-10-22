/*
 * July 21, 2021
 *
 * Lab 13: Client
 */
public class lab13_Client {
    public static void main(String[] args){
        //creating objects of one Student and one Doctor class
        //Alex is a student whose major is CS, GPA is 3.4, number of credit hours is 54, height is 170 cm,
        //weight is 150 pounds, and age is 18.
        lab13_Student alex = new lab13_Student(18, 150, 170, "CS", 3.4, 54);
        
        //Jack is a doctor whose speciality is Dermatology, number of years is 4,
        //height is 173 cm, weight is 179 pounds, and age is 40.
        lab13_Doctor jack = new lab13_Doctor(40, 179, 173, 4, "Dermatology");

        //printing student's major, gpa, year, and age
        System.out.println("Alex is a student.");
        System.out.println("His major is " + alex.getMajor() + ", his GPA is " +alex.getGPA() + ", he is a " + alex.getYear() + ", and he is " + alex.getAge() + " years old.");
        System.out.println();   //line to add space between Alex and Jack
        //printing doctor's specialty, height, weight, and salary
        System.out.println("Jack is a doctor.");
        System.out.println("His speciality is " + jack.getSpeciality() + ", his height is " + jack.getHeight() + " cm, his weight is " + jack.getWeight() + " pounds, and his salary is $" + jack.getSalary());
        System.out.println();
    }
}
