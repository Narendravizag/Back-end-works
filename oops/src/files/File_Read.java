package files;
//importing the FileReader class
import java.io.FileReader;

public class File_Read {
public static void main(String[] args) {

char[] array = new char[19];

try {
 // Creates a reader using the FileReader
 FileReader input = new FileReader("C:\\Users\\hp\\Desktop\\Training\\java\\oops\\src\\write.txt");

 // Reads characters
 input.read(array);

 System.out.println("Data in the file:");

 System.out.println(array);

 // Closes the reader
 input.close();
}
catch(Exception e) {
 e.getStackTrace();
}
}
}
