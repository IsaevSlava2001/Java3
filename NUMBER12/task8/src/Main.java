import java.util.Scanner;

public class Main {
    public static String  FromLeftToRight(int q) {
        if (q < 10)
        {
            return Integer.toString(q);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return FromLeftToRight(q / 10) + " " + q % 10;
        }
    }
    public static void Progression12()
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if (v > 0) {
            if (v % 2 == 1)
            {
                System.out.println(v);
                Progression12();
            }
            else
            {
                Progression12();
            }
        }
    }
    public static void Recursion13()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Базовый случай
        if (x > 0)
        {
            int m = sc.nextInt();
            System.out.println(x);
            if (m > 0) {

                Recursion13();
            }
        }
    }
    public static void main(String[] args)
    {
        //System.out.println("Вариант 12:");
        //Progression12();
        //System.out.println("Вариант 13:");
        //Recursion13();
        System.out.println("Вариант 14:");
        System.out.println(FromLeftToRight(153));
    }
}