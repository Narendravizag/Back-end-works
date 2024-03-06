package files;
//importing the FileWriter class
import java.io.*;

public class File_Write {
public static void main(String args[]) {

String data = "Welcome to Narendra";

try {
  // Creates a Writer using FileWriter
  FileWriter output = new FileWriter("C:\\Users\\hp\\Desktop\\Training\\java\\oops\\src\\write.txt");

  // Writes string to the file
  output.write(data);

  System.out.println("Data is written to the file.");

  // Closes the writer
  output.close();
}
catch (Exception e) {
  e.getStackTrace();
}
}
}
