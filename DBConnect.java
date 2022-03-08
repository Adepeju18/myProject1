import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConnect {
	public static void main(String[]args)
	{
		String DriveName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/university";
		String user = "root";
		String password = "root";
		try
		{
			
			Class.forName(DriveName);
			
			Connection con =DriverManager.getConnection(url, user, password);
			if(con !=null) {
				System.out.println("DB Connection ok");
			}
			else {
				System.out.println("DB Connection fails");
			}
			Statement stmt = con.createStatement();
			int row_count = stmt.executeUpdate("insert into student(id,name,sub,score)values(105,'Chi','SQL',80.12)");
			System.out.println("Row Insert :"+row_count);
//			int row_count1=stmt.executeUpdate("insert into student(id,name,sub,score)values(106,'Zara','CSS',80.15)");
//			System.out.println("Row Insert :"+row_count1);
		}
		catch(Exception ex)
		{
			System.out.println("DB Error :"+ex);
		}
	}
}
