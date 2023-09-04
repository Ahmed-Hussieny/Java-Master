public class Main {
    public static void main(String[] args) {

//      Methods = a block of code that is executed whenever it is called upon
      hello();

      String name = "Ahmed";
      helloWithName(name);

      String Name = "Ahmed";
      int age = 22;
      helloWithNameAndAge(Name , age);

//  EX on return method
      
      int x=3;
      int y=4;
      int res = add(x,y);
      System.out.println(res);

    }

//    use static key word because main method ^ is static and i call method with static key word to avoid making instance from class
//  like this   Main obj = new Main();
//                obj.hello();
  
   static void hello(){
      System.out.println("Hello");
    }

//    passing variable ( parameter ) to method
  
  static void helloWithName(String name){
    System.out.println("Hello "+name);
  }

  static void helloWithNameAndAge(String name , int age){
    System.out.println("Hello "+name + "you are "+age);
  }

//  we can make method return and take this return as a result for calling it

//   static (data type of return) name of it
  
  static int add(int a,int b){
      return a+b;
  }

}
