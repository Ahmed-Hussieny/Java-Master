import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(x);

//        so to limit the scale
//        from 0 to number-1 you put inside nextInt(--{here}--)
        int y = random.nextInt(6);
        System.out.println(y);
//        if you need it from anyNumber to your number make this  nextInt(--{your number}--)+ anyNumber started from
        int z = random.nextInt(6)+1;
        System.out.println(z);

//        you can choose any type of data
        boolean bo = random.nextBoolean();
        System.out.println(bo);

        double k = random.nextDouble();
        System.out.println(k);

    }
}
