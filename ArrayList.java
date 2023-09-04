import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//    ArrayList = a resizable array.
//                Elements can be added and removed after compilation phase
//                 store reference data types


//      ArrayList<reference> nameOfArrayList = new   ArrayList<reference>();
      ArrayList<String>  food = new ArrayList<>();
      food.add("pizza");
      food.add("hamburger");
      food.add("hotdog");

//                       .size with arrayList not length
//      for (int i = 0 ; i<food.size(); i++ ){
//        System.out.println(food.get(i));
//      }

//      food.set(index , element)
        food.set(0,"sushi");

//      food.remove(index)
        food.remove(2);

//      food.clear()
      food.clear();

      for (int i = 0 ; i<food.size(); i++ ){
        System.out.println(food.get(i));
      }
    }
}
