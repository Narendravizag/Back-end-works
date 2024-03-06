package files;
import java.io.*;

public class File_Create {
public static void main(String[] args) {

 // create a file object for the current location
 File file = new File("C:\\Users\\hp\\Desktop\\Training\\java\\oops\\src\\test1.txt");

 try {

   // trying to create a file based on the object
   boolean value = file.createNewFile();
	
   if (value) {
     System.out.println("The new file is created.");
   }
   else {
     System.out.println("The file already exists.");
   }
 }

 catch(Exception e) {
   e.getStackTrace();
 }
}
}