package Exam2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JD {
	private static String url;
	private static String driver;
	private static String name;
	private static String password;
	public static String countryid;
	static{
		Properties p=new Properties();
		try {
			p.load(JD.class.getClassLoader().getResourceAsStream("jd.properties"));
			url=p.getProperty("url");
			driver=p.getProperty("driver");
			name=p.getProperty("name");
			password=p.getProperty("password");
			countryid=p.getProperty("Country_ID");
			Class.forName(driver);
		
		} catch (IOException e) {

			e.printStackTrace();
			throw new RuntimeException("propertiesÎÄ¼þ¼ÓÔØÊ§°Ü",e);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,name,password);
	}
	public static void close(Connection c){
		if(c!=null){
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
