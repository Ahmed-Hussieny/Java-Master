import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    /* String Methods
    *
    *    String = a reference data type that can store one or more characters
    *              reference data type have access to useful methods
    */

        String name = "Ahmed   ";
//      equals(String you compare with) => compare two strings and return boolean value (true or false)
      boolean result = name.equals("ahmed");
        System.out.println(result); //  => false because it's compare if char in String lowercase or uppercase


//      equalsIgnoreCase(String you compare with) => compare two strings and return boolean value (true or false) but does not care if char in String lowercase or uppercase
      boolean result2 = name.equalsIgnoreCase("ahmed");
        System.out.println(result2); // => true

//        length() => number of characters in string include space
        int len = name.length();
        System.out.println(len);

//        charAt(index) => return character in a specific index you put
        char c = name.charAt(2);
        System.out.println(c);

//        indexOf(character) => return the index of character you put
        int index = name.indexOf('d');
        System.out.println(index);

//        isEmpty() => return boolean value if the String is empty or not (true or false)
        boolean empty = name.isEmpty();
        System.out.println(empty);

//        toUpperCase() => return sting in upperCase
        String upper = name.toUpperCase();
        System.out.println(upper);

//        toLowerCase() => return sting in lowerCase
        String lower = name.toLowerCase();
        System.out.println(lower);

//        toUpperCase() => remove empty spaces in string
        String trim = name.trim();
        System.out.println(trim);

//        replace(oldChar , newChar) => return name after replace copy of it not in the original one
        String replace = name.replace('m','g');
        System.out.println(replace);
    }
}
