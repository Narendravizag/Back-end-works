package jdbctest;


import java.sql.*;


public class JDBCUpdateExample {
   static final String DB_URL = "jdbc:mysql://localhost/narendra";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT id, fname, lname, designation ,salary , company FROM emd";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "UPDATE emd " +
            "SET fname = 'nagendra' WHERE id=348475";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.println(" ID: " + rs.getInt("id"));
            System.out.println(", Salary: " + rs.getInt("salary"));
            System.out.println(", Fname : " + rs.getString("fname"));
            System.out.println(", Lname : " + rs.getString("lname"));
            System.out.println(", Designation: " + rs.getString("designation"));
            System.out.println(", Company: " + rs.getString("company"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}