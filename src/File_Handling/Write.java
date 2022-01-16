package File_Handling;
import java.io.FileWriter;

public class Write {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
  
      FileWriter output = new FileWriter("C:\\Users\\tigha\\Documents\\HelloWorld.txt");
      output.write(data);
      System.out.println("Data is written to the file.");

      output.close();
    }
    
    catch (Exception e) 
    {
      e.getStackTrace();
    }
 }
}