import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;



public class SafeCatalog
{

    ArrayList <File> list;

    public SafeCatalog (String Path) throws IOException
    {
        System.out.println("A list of files of a directory..." + Path);

        list = new ArrayList<File>();
        File f = new File (Path);
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles)
        {
            list.add(f1);
            System.out.println(list.get(i++));
        }
    }

    public ArrayList<File> getList()
    {
        return list;
    }

    public File getIndex(int i)
    {
        return list.get(i);
    }

    public void WriteToFileList(String path) throws IOException
    {
        System.out.println("Write to the file list..." + path);

        byte [] bt;
        try (FileOutputStream inFile = new FileOutputStream(path))
        {

            for(File f: list)
            {
                bt = (f.getCanonicalPath() + System.getProperty("line.separator")).getBytes();
                inFile.write(bt);
            }
        }
    }

    public void ReadFile (String path, int cont) throws IOException
    {

        System.out.println("Shows the first five files..." + path);

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
                if(i ==(cont-1))
                {
                    return;
                }

                i++;

            }
        }

    }

}