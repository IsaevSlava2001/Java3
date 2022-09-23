import java.util.Scanner;
public class main
{
    public static int recursion2(int a, int b)
    {
        if (a > b + 1)
        {
            return 0;
        }
        if (a == 0 || b == 0)
        {
            return 1;
        }
        return recursion2(a, b - 1) + recursion2(a - 1, b - 1);
    }
    public static String recursion1(String s)
    {
        if (s.length() == 1)
        {
            return "YES";
        } else
        {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
            {
                // Базовый случай 
                if (s.length() == 2)
                {
                    return "YES";
                }
                return recursion1(s.substring(1, s.length() - 1));
            }
            else
            {
                return "NO";
            }
        }
    }
    public static int recursion3(int n,int i)
    {
        return (n==0) ? i : recursion3( n/10, i*10 + n%10 );
    }
    public static void menu()
    {
        Scanner in1=new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int a = in1.nextInt();
        switch (a)
        {
            case 1:
                Scanner in = new Scanner(System.in);
                System.out.print("Введите слово: ");
                String num = in.nextLine();
                System.out.println(recursion1(num));
                menu();
                break;
            case 2:
                Scanner in2=new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int a2 = in2.nextInt();
                Scanner in3 = new Scanner(System.in);
                System.out.print("Введите второе число: ");
                int b2 = in3.nextInt();
                System.out.println(recursion2(a2, b2));
                menu();
                break;
            case 3:
                Scanner in4=new Scanner(System.in);
                System.out.print("Введите число: ");
                int a3 = in4.nextInt();
                System.out.println(recursion3(a3, 0));
                menu();
                break;
            default:
                menu();
                break;
        }
    }
    public static void main(String[] args)
    {
        menu();
    }
}