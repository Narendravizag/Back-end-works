package jdbctraining;

import java.sql.*;

public class Employeedata {
	static final String DB_URL="jdbc:mysql://localhost/ Narendra";
	static final String USER="root";
	static final String pass="";
	
	public static void main(String[]args) {
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,pass);
				Statement smt=conn.createStatement();
				){
			System.out.println("connected successfully .....");
			String sql;
			
			sql="INSERT INTO Emd VALUES(348471,'Yakub','mood','javadeveloper',45060,'info')";
			smt.executeUpdate(sql);
			sql="INSERT INTO Emd VALUES(348472,'hareesh','rambha','Fontend',45000,'tech')";
			smt.executeUpdate(sql);
			sql="INSERT INTO Emd VALUES(348473,'venkat','yenmi','Back-end',450200,'micro')";
			smt.executeUpdate(sql);
			sql="INSERT INTO Emd VALUES(348474,'rohith','meda','Ux',450300,'con')";
			smt.executeUpdate(sql);
			sql="INSERT INTO Emd VALUES(348475,'narendra','akula','Gd',450400,'QCITY')";
			smt.executeUpdate(sql);
			sql="INSERT INTO Emd VALUES(348476,'Vamshi','savula','dm',450500,'Acce')";
			smt.executeUpdate(sql);
			System.out.println("Inserted records in to the table...");
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		} 
	}
	
	

