package test;
import java.sql.*;
public class DBConnectio {
	public  static Connection con=null;
	private DBConnectio() {}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rcl1234");
				
		}catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getCon()
	{
		return con;
	}
	

}
