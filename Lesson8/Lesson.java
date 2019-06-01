import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lesson{
  public static void main(String[]args){
    String fileName = "file.txt";
    try{
      File f = new File(fileName);//can combine
      Scanner in = new Scanner(f);//into one line


    }catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
      //e.printStackTrace();
      System.exit(1);
    }
  }
}
