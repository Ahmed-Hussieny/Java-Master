import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age= in.nextInt();

        if (age>=60){ // if condition is true
            System.out.println("OK Boomer !");
        } else if (age >= 18) { //another option
            System.out.println("you are an adult");
        }
        else if (age>= 13) { //another option
            System.out.println("you are an teenager");
        }
        else { // if not all of the above
            System.out.println("you are not an adult");
        }
      
        in.close();
    }
}
