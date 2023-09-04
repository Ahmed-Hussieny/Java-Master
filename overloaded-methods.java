import java.util.ArrayList;
import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
      
//      overloaded methods = methods that share the same name but have different parameters
//                             method name + parameters = method signature

      int res1 = add(1,2);
      System.out.println(res1);

      int res2 = add(1,2,3);
      System.out.println(res2);

      int res3 = add(1,2,3,4);
      System.out.println(res3);


      double res4 = add(1.0,2.0,3.0,4.0);
      System.out.println(res4);


    }

  //    change name of method or change parameters or type of return

  static int add(int a,int b){
      System.out.println("this is overloaded method #1");
      return a+b;
    }
    static int add(int a,int b , int c){
      System.out.println("this is overloaded method #2");
      return a+b+c;
    }
    static int add(int a,int b , int c,int d){
      System.out.println("this is overloaded method #3");
      return a+b+c+d;
    }


//**************************************************************
  
  static double add(double a,double b){
    System.out.println("this is overloaded method #4");
    return a+b;
  }
  static double add(double a,double b , double c){
    System.out.println("this is overloaded method #5");
    return a+b+c;
  }
  static double add(double a,double b , double c,double d){
    System.out.println("this is overloaded method #6");
    return a+b+c+d;
  }
  
}
