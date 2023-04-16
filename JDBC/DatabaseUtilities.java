package homework4B;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtilities {
	public static String url="jdbc:postgresql://localhost/godorodb";
	public static String user="postgres";
	public static String password="12345";
	public static String driver="org.postgresql.Driver";
	
	public static Connection getConnection() throws Exception{
		
		
		Class.forName(driver);
		
		Connection connection=DriverManager.getConnection(url,user,password);
		return connection;
		
	}

	
}
