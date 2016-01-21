package sql;

import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import GlobalConfig.config;
public class SqlConn {

	public SqlConn() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = config.getUrl();
		String username = config.getUsrname();
		String password = config.getPassword();
		java.sql.Connection conn = null;
		try {
			Class.forName(driver);// classLoader,加载对应驱动
			conn = DriverManager.getConnection(url, username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();    //打印错误
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
