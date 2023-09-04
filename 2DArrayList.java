import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

//      2D ArrayList = a dynamic list of lists
//      you can change the size of these lists during runtime

      ArrayList<String> bakeryList = new ArrayList<>();
      bakeryList.add("pasta");
      bakeryList.add("garlic bread");
      bakeryList.add("donuts");

      System.out.println(bakeryList);
      System.out.println(bakeryList.get(0));

      ArrayList<String> producerList = new ArrayList<>();
      producerList.add("tomatoes");
      producerList.add("zucchini");
      producerList.add("peppers");

      System.out.println(producerList);
      System.out.println(producerList.get(0));


      ArrayList<String> drinksList = new ArrayList<>();
      drinksList.add("soda");
      drinksList.add("coffee");

      System.out.println(drinksList);
      System.out.println(drinksList.get(0));

// we can add all of these list in one List

      ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
      groceryList.add(producerList);
      groceryList.add(bakeryList);
      groceryList.add(drinksList);

      System.out.println(groceryList);
      System.out.println(groceryList.get(0));
      System.out.println(groceryList.get(0).get(0));
      System.out.println(groceryList.get(0).get(2));
      System.out.println(groceryList.get(1).get(2));
     }

}
