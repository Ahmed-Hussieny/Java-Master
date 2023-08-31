import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = in.nextLine();

        switch (day){
            case "Saturday": System.out.println("it is Saturday!");
//                if it's fit we need to go out from switch and it's important
                break;
            case "Sunday": System.out.println("it is Sunday!");
                break;
            case "Monday": System.out.println("it is Monday!");
                break;
            case "Tuesday": System.out.println("it is Tuesday!");
                break;
            case "Wednesday": System.out.println("it is Wednesday!");
                break;
            case "Thursday": System.out.println("it is Thursday!");
                break;
            case "Friday": System.out.println("it is Friday!");
                break;
            default: System.out.println("Tht is not a day!");//if no valid input related to week days
        }
      in.close();
    }
}
