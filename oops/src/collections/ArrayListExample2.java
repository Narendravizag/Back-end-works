package collections;
import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Narrendra");//Adding object in arraylist    
  list.add("Ykub");    
  list.add("Venkat");    
  list.add("Vamsi"); 
  list.add("Hareesh");	
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
  while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
}  
