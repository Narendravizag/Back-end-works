package jdbctraining;
import java.sql.*;
public class JDBCInsertExample {
	
   //database properties
   static final String DB_URL = "jdbc:mysql://localhost/employeedata"
   		+ "";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {

      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table..."); 
        
//        
       String sql = "INSERT INTO employee VALUES (38800, 'ZarGDFa', 'ARRli', 18000,'company', PRIMARY KEY (ID)";
//
         stmt.executeUpdate(sql);

         sql = "INSERT INTO employee VALUES (123456, 'Narendra', 'Reddy', 25000,'Wipro')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO employee VALUES (852014, 'Hresh', 'Khan', 30000,'Infosys')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO employee VALUES(32506, 'Yakoob', 'Mittal', 20008,'Ibm')";
         stmt.executeUpdate(sql);
         sql ="INSERT INTO employee VALUES ( 5287899,'Venkat','Yenimi',85000,'Deloitee')";
         stmt.executeUpdate(sql);
         sql ="INSERT INTO employee VALUES ( 36879,'Vamsi','Yeni',55000,'Accesnsture')";
         stmt.executeUpdate(sql);


         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
