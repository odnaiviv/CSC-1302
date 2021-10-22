/*
 * July 23, 2021
 *
 * Lab 14: Array List Practice
 */
//importing ArrayList, HashMap, and Map packages
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class lab14 {
    public static void main(String[] args){
        //initializing name in the Array List
        ArrayList<Character> name = new ArrayList<Character>();
        //using the example name "bob"
        //adding character for the name
        name.add('b');
        name.add('o');
        name.add('b');

        //initializing another name in the Array List
        ArrayList<Character> name1 = new ArrayList<Character>();
        //using example name "bob" twice
        name1.add('b');
        name1.add('o');
        name1.add('b');
        name1.add('b');
        name1.add('o');
        name1.add('b');
        //calling redundant character match method with name1
        rcm(name1);
    }

    //Redundant Character Match method that checks for duplicates in name
    //using "RCM" instead of "RedundantCharacterMatch"
    public static void rcm(ArrayList<Character> name){
        //declaring a hash map
        Map<Character, String> map = new HashMap<>();
        //loop to get the size of the name arraylist
        for(int i = 0; i < name.size(); i++) {
            //checking map for the current character's key
            if(!map.containsKey(name.get(i))) {
                //adding to current key if it is not there
                map.put(name.get(i), Integer.toString(i));
            }
            //updating the index if current key is there
            else {
                String test = map.get(name.get(i));
                test = test + ", " + i;
                map.replace(name.get(i), test);
            }
        }
        //statement to print results of the overall method
        for(Character x : map.keySet())
            System.out.println(x + ": " + map.get(x));
    }
}
