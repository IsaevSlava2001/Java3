import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BodyOfSafeCatalog
{

    public static void main(String[] args) throws IOException
    {

        String pathDir = "C://Users//1655299//Desktop//ГИТХАБ//Java3";
        String pathFile = "C://Users//1655299//Desktop//ГИТХАБ//Java3//javaonelove.txt";
        SafeCatalog ff = new SafeCatalog(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }

}