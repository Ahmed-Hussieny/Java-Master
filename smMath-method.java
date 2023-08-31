import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
//        get maximum number
        double max = Math.max(x,y);
        System.out.println(max);

//      get the absolute value of number
        double abs = Math.abs(y);
        System.out.println(abs);

//        get the square root of value
        double sqrt = Math.sqrt(Math.abs(y));
        System.out.println(sqrt);

//        get the round (Down) of number
        double round = Math.round(x);
        System.out.println(round);

//        get the round (UP) of number
        double ceil = Math.ceil(x);
        System.out.println(ceil);
//******************************************************************************
//        let's make a small program get the hypotenuse of triangle
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side a :");
        a = in.nextDouble();

        System.out.println("Enter Side b :");
        b = in.nextDouble();

//      let get the value
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse is : "+c);
