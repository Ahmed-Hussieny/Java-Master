import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
        * while loop = executes a block of code as long as a it's condition remains true      
*/    
        Scanner in = new Scanner(System.in);
        String name = "";
        

         while (name.isBlank()){// if name is empty it's asking again until user must put a name
             System.out.print("Enter yor name : ");
             name = in.nextLine();
         }
        System.out.println("Hello "+name);
         
         
        in.close();
    }
}
