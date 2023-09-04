import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

//      for-each = traversing technique to iterate through the elements in an array/collection
//                  less steps ,  more readable
//                  less flexible

      String [] animals ={"cat" , "dog" , "rat","bird"};

      for (String i:animals) {
        System.out.println(i);
      }

      ArrayList<String> Animals  =  new ArrayList<>();
      Animals.add("cat");
      Animals.add("dog");
      Animals.add("rat");
      Animals.add("bird");

      for (String i:Animals) {
        System.out.println(i);
      }
      }

}
