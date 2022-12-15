import java.util.Objects;
import java.util.Scanner;

public class task7
{
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        while (true){
            String key = myScanner.nextLine();
            try{
                printDetails( key );
                break;
            }
            catch (Exception e){
                System.out.println("Ошибка");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "empty")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }


    public static void main(String [] args){
       task7 a = new task7();
        a.getKey();
    }
}
