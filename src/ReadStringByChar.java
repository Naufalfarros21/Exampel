import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReadStringByChar {
    public static void main(String[] args) {
        try
        {
            Scanner InputData = new Scanner(System.in);
            String directory = System.getProperty("user.dir");
            System.out.println("Current directory => " + directory);
            System.out.println("Type Filename = ");
            String fileName = InputData.nextLine();
            System.out.println("Type Directory = ");
            String dirName = InputData.nextLine();
            if ((fileName.isEmpty())||(dirName.isEmpty())){
                System.out.println("Process is not continue...");
                System.exit(0);
            }
            File myFile = new File(dirName+"/"+fileName);
            if (myFile.exists()){
                FileReader fr=new FileReader(dirName+"/"+fileName);
                System.out.println("File Content...");
                int r=0;
                while ((r= fr.read())!=-1)
                {
                    System.out.print((char)r);
                    TimeUnit.MILLISECONDS.sleep(120);
                }
            }else{
                System.out.println("File does not exist...");
                System.exit(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
