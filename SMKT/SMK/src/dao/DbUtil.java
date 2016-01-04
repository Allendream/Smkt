package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	static String url="jdbc:mariadb://localhost:3306/smkt";
	static String userName="root";
	static String password="123456";
	static Connection conn=null;
	public static Connection getConnection(){
		
		try{
			//硬编码
			Class.forName("org.mariadb.jdbc.Driver");	
			conn=DriverManager.getConnection(url,userName,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}		//建立到数据库的连接
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
