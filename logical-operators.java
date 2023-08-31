import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* logical operators = used to connect two or more expressions
        *
        *           && = (AND) both conditions must be true
        *           || = (OP)  either condition must be true
        *           !  = (NOT) reverses boolean value of condition
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature");
        int temperature = in.nextInt();

//******************************************
//   EXAMPLE on AND operator
        if(temperature > 30){
            System.out.println("it's hot outside");
        }
        else if (temperature >= 20 && temperature <= 30){ // both conditions must be true
            System.out.println("it's warm outside");
        }
        else {
            System.out.println("it's cold outside");
        }

//******************************************
//   EXAMPLE on OP operator
        System.out.println("you are playing a game! press q or Q to quit");
        String Exit = in.next();

        if (Exit.equals("q") || Exit.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("you are still playing the game *lol* ");
        }
//******************************************
//   EXAMPLE on NOT operator

        System.out.println("you are playing a game! press q or Q to quit");
        String Exit2 = in.next();

        if ( !Exit2.equals("q") && !Exit2.equals("Q")){
            System.out.println("you are still playing the game *lol* ");
        }
        else{
            System.out.println("You quit the game");

        }
        in.close();
    }
}
