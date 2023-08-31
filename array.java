public class Main {
    public static void main(String[] args) {

      // array = used to store multiple values in a single variable and single data type
      
//        String car = "Camaro";

// EXAMPLE ONE

//index                     0          1        2      3
        String[] Cars = {"Camaro","Corvette","Tesla","BMW"};
        Cars[0]="Mustang";//modify the 0 element
        System.out.println(Cars[0]);


// EXAMPLE TWO

        String[] cars = new String[3];

        cars[0]="Camaro";
        cars[1]="Corvette";
        cars[2]="Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
