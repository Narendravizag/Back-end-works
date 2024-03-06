package collections;
import java.util.*;  
public class Vector_Collection { 
 
        public static void main(String args[]) {  

        //Create an empty Vector of even numbers        
        Vector<Integer> evenVector= new Vector <> ();  

          //Add elements in the vector  
        evenVector.add(2);  
        evenVector.add(4);  
        evenVector.add(6);  
        evenVector.add(8);  
        evenVector.add(10);  
        evenVector.add(12);  
        evenVector.add(14);  
        evenVector.add(16);  

        //Display the vector  
        System.out.println("Vector evenVector contents: " +evenVector);  

        //delete the first occurence of an element 4 using remove method 
        System.out.println("\nFirstoccurence of element 4 removed: "+evenVector.remove((Integer)4));  
        

	//Display the vector   
    	 System.out.println("\nVector contents after remove operation: " +evenVector); 

 
        //Remove the element at index 4 & display the vector 
          System.out.println("\nRemove element at index 4: " +evenVector.remove(4));  
        System.out.println("\nVector contents after remove: " +evenVector);  

        //hashcode for the vector  
       System.out.println("\nHash code of the vector = "+evenVector.hashCode());  
        //Get the element at index 1  
         System.out.println("\nElement at index 1 is = "+evenVector.get(1)); 
          }  
}