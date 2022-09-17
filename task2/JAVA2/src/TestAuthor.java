import java.lang.*;
public class TestAuthor
{
    public static void main(String[] args) {
        Author a1 = new Author("John", "john@author.ru", 'm');
        Author a2 = new Author("Sarah", "sarah@author.ru", 'f');
        a2.setEmail("Sarah@author.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
