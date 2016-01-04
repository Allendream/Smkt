package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




	public class DbUtil {
		//static String url="jdbc:sqlserver://localhost:1433; DatabaseName=imtshop";
		private static String url="jdbc:mariadb://localhost:3306/smkt";
		private static String userName="root";
		private static String password="123456";
		private static Connection conn=null;
		public static Connection getConnection(){
			
			try{
				
				Class.forName("org.mariadb.jdbc.Driver");	
				conn=DriverManager.getConnection(url,userName,password);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
	}


