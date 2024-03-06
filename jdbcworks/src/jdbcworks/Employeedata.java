package jdbcworks;
import java.sql.*;

public class Employeedata {
	static final String DB_URL="jdbc:mysql://localhost/ employeedata";
	static final String USER="root";
	static final String pass="";
	
	public static void main(String[]args) {
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,pass);
				Statement smt=conn.createStatement();
				){
			System.out.println("Inserting records in to the table");
			String sql;
			
			sql="INSERT INTO servents VALUES(348471,'Yakub','mood',45060,'info')";
			smt.executeUpdate(sql);
			sql="INSERT INTO servents VALUES(348472,'hareesh','rambha',45000,'tech')";
			smt.executeUpdate(sql);
			sql="INSERT INTO servents VALUES(348473,'venkat','yenmi',450200,'micro')";
			smt.executeUpdate(sql);
			sql="INSERT INTO servents VALUES(348474,'rohith','meda',450300,'con')";
			smt.executeUpdate(sql);
			sql="INSERT INTO servents VALUES(348475,'narendra','akula',450400,'QCITY')";
			smt.executeUpdate(sql);
			sql="INSERT INTO servents VALUES(348476,'Vamshi','savula',450500,'Acce')";
			smt.executeUpdate(sql);
			System.out.println("Inserted records in to the table...");
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		} 
	}
	
