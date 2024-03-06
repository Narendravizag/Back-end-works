package files;
import java.io.File;

public class File_Delete {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\hp\\Desktop\\Training\\java\\oops\\src\\write.txt");

    // deletes the file
    boolean value = file.delete();
    if(value) {
      System.out.println("The File is deleted.");
    }
    else {
      System.out.println("The File is not deleted.");
    }
  }
}
