package sql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sql.Test_info;
import java.util.List;
public class IPV6_Web {

	
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ipv6_web";
		String username = "root";
		String password = "ict";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username,
					password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();    //打印错误
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	private static ArrayList< Info_Capture_Packet>  getInfo_Capture_PacketList() {
		Connection conn = getConn();
		String sql = "select * from info_capture_packet";
		ArrayList< Info_Capture_Packet> list = new ArrayList< Info_Capture_Packet>();
		PreparedStatement pstmt;
		// 取得数据库操作对象
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);

			// 循环记录集，查看每一行每一列的记录
			while (rs.next()) {
				// 第一列cid
				String cid = rs.getString(1);
                 int c_id=Integer.parseInt(cid);
				// 第2列 id
				String id = rs.getString(2);
				 int i_d=Integer.parseInt(id);
				// 第3列info_packet
				String info_packet= rs.getString(3);
				
                Info_Capture_Packet info_capture_packet = new Info_Capture_Packet(c_id,i_d,info_packet);
				list.add( info_capture_packet );
			}

		} catch (Exception e) {
			System.out.println(IPV6_Web.getTest_InfoList());           //这里可能有问题
		}
		return list;
	}
	public static ArrayList< Test_info>  getTest_InfoList() {
		Connection conn = getConn();
		String sql = "select * from test_info";
		ArrayList<Test_info> list = new ArrayList< Test_info>();
		PreparedStatement pstmt;
		// 取得数据库操作对象
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);

			// 循环记录集，查看每一行每一列的记录
			while (rs.next()) {
				// 第一列id
				String id = rs.getString(1);
                 int i_d=Integer.parseInt(id);
				// 第2列 time
				String time = rs.getString(2);
				 double  t_ime=Double.parseDouble(time);
				// 第3列type
				String type= rs.getString(3);
				//第4列info
				String info=rs.getString(4);
				
				Test_info test_info = new Test_info(i_d,t_ime,type,info);
				list.add( test_info );
			}

		} catch (Exception e) {
			System.out.println(IPV6_Web.getTest_InfoList());    //同上
		}
		return list;
	}
}
