import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task 1
        long l = 123456;
        double d1, d2;
        float f = 14.75f;
        char c1 = '0';
        System.out.println("Змінні оголошено!");

        //Task 2
        l = (long) f;
        d1 = (Math.random() * (1000 - 100)) + 100;
        //System.out.println("d1 = " + d1);
        Random random = new Random();
        random.setSeed(random.nextInt());
        d2 = (random.nextDouble(99 - 1) + 1);
        //System.out.println("d2 = " + d2);
        System.out.println("\nРезультати привласнення:\nl = " + l + "\nd1 = " + d1 + "\nd2 = " + d2);

        //Task 3
        double y = Math.sin(d1) * Math.cos(d2) - (Math.atan(d1)/Math.atan(d2));
        System.out.println("\nРезультат обчислення:\ny = " + y);
    }
}