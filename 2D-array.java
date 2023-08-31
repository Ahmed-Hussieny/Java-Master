public class Main {
    public static void main(String[] args) {

        /*     2D array = an array of arrays
      EX :
        *    $ $ $ $
        *    $ $ $ $
        *    $ $ $ $
        *    $ $ $ $
        * */
// ****************************************************
      
//EXAMPLE ONE
        String [][] cars  = new String[3][3];
        cars[0][0]="Camaro";
        cars[0][1]="Corvette";
        cars[0][2]="Silverado";
      
//        new row
      
        cars[1][0]="mustang";
        cars[1][1]="Ranger";
        cars[1][2]="F-150";
      
//        new row
      
        cars[2][0]="Ferrari";
        cars[2][1]="Lamborghini";
        cars[2][2]="Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }

//*******************************************************

//EXAMPLE TWO 

        String [][] Cars = {
                                {"Camaro","Corvette","Silverado"},
                                {"mustang","Ranger","F-150"},
                                 {"Ferrari","Lamborghini","Tesla"}
                           };

      
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < Cars[i].length; j++) {
                System.out.print(Cars[i][j]+" ");
            }
        }
    }
}
