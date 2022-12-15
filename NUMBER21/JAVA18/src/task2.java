import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e)
        {
            System.out.println("trying to delete by zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("trying to get not integer");
        }
    }
}
