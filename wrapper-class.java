import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    /*
    * wrapper class = provides a way to use primitive data types as reference data types
    *                 reference data types contain useful methods
    *                 can be used with collections (ex.ArrayList)
    *
    *
    *    primitive     // wrapper
    * ///----------//--//----------
    *     boolean         Boolean
    *     char            character
    *     int             Integer
    *     double           Double
    *
    *
    *
    * // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
    * //unboxing = the reverse of autoboxing . Automatic conversion of wrapper class to primitive
    * */
    Boolean a = true;
    Character b = '@';
    Integer c = 123;
    Double d = 3.14;
    String e = "Ahmed";

//    there a lot of advantage of methods of wrapper classes (ArrayList)

    if(a==true){//unboxing
      System.out.println("this is true");
    }
    if(a.equals(true)){
      System.out.println("this is true");
    }

    //primitive is faster


    }
}
