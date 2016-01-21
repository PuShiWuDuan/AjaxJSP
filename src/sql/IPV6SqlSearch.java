package sql;

import java.sql.*;
import java.util.ArrayList;
public class IPV6SqlSearch {
	
	private static java.sql.Connection conn = SqlConn.getConn();
	public static Boolean  getUserLoginCkeck(String username,String password)  {
		String sql = "select * from user_info";
		Statement stmt ;
		// 取得数据库操作对象
		System.out.println(username);
		System.out.println(password);
		try {
			// 查询数据库对象,返回记录集(结果集)
			stmt  = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			//循环记录集，查看每一行每一列的记录
			System.out.println("------------");
			while (rs.next()){
				// 第一列username
				String user = rs.getString(1);
				System.out.println(user);
				System.out.println(rs.getString(2));
				if(username.compareTo(user)==0)
				{
					System.out.println(rs.getString(1));
				      // 第2列password
					String pass = rs.getString(2);
				     if(password.compareTo(pass) ==0)
				     {
				    	 System.out.println(rs.getString(2));
				    	 return true;
				     }
				     System.out.println(rs.getString(2));
				}
			}
		} catch (Exception e) {
			System.out.println(IPV6SqlSearch.getTest_InfoList());           //这里可能有问题
		}
		return false;
	}
	public static ArrayList< ParsePacketInfoTable>  getParsePacketList() {
		
		String sql = "select * from Parseinfo";
		ArrayList< ParsePacketInfoTable> list = new ArrayList< ParsePacketInfoTable>();
		Statement pstmt;
		// 取得数据库操作对象
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt =  conn.createStatement();
			ResultSet rs = pstmt.executeQuery(sql);

			// 循环记录集，查看每一行每一列的记录
			while (rs.next()) {
				// 第一列cid
				String cid = rs.getString(1);
                 int c_id=Integer.parseInt(cid);
				// 第2列 id
				String id = rs.getString(2);
				 int i_d=Integer.parseInt(id);
				// 第3列name
				String name= rs.getString(3);
				// 第4列info
				String info= rs.getString(4);
				ParsePacketInfoTable ParsePacketInfo = new ParsePacketInfoTable(c_id,i_d,name,info);
				list.add( ParsePacketInfo );
			}

		} catch (Exception e) {
			System.out.println(IPV6SqlSearch.getParsePacketList());           //这里可能有问题
		}
		return list;
	}
	public static ArrayList< InfoCapturePacketTable>  getInfo_Capture_PacketList() {
		String sql = "select * from info_capture_packet";
		ArrayList< InfoCapturePacketTable> list = new ArrayList< InfoCapturePacketTable>();
	    Statement pstmt;
		// 取得数据库操作对象
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt = conn.createStatement();
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
				
                InfoCapturePacketTable info_capture_packet = new InfoCapturePacketTable(c_id,i_d,info_packet);
				list.add( info_capture_packet );
			}

		} catch (Exception e) {
			System.out.println(IPV6SqlSearch.getInfo_Capture_PacketList());           //这里可能有问题
		}
		return list;
	}
	public static String  getInfo_Capture_PacketList(String sid) {
		String sql = "select * from info_capture_packet";
		Statement pstmt;
		// 取得数据库操作对象
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt =  conn.createStatement();
			ResultSet rs = pstmt.executeQuery(sql);

			// 循环记录集，查看每一行每一列的记录
			while (rs.next()) {
				// 第2列 id
				String id = rs.getString(2);
				// 第3列info_packet
				String info_packet= rs.getString(3);
				if(id.contains(sid))return info_packet;
			}

		} catch (Exception e) {
			System.out.println(IPV6SqlSearch.getInfo_Capture_PacketList());           //这里可能有问题
		}
		return "";
	}
	public static ArrayList< TestinfoTable>  getTest_InfoList() {
		String sql = "select * from test_info";
		ArrayList<TestinfoTable> list = new ArrayList< TestinfoTable>();
		Statement pstmt = null;
		// 取得数据库操作对象
			// 查询数据库对象,返回记录集(结果集)
			try {
				pstmt =   conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet rs = null;
			try {
				rs = pstmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 循环记录集，查看每一行每一列的记录
			try {
				while (rs.next()) {
					// 第一列id
					String id = rs.getString(1);
					//System.out.println(id);
					// 第2列 time
					String time = rs.getString(2);
					//System.out.println(time);
					// 第3列type
					String type= rs.getString(3);
					//第4列info
					String info=rs.getString(4);
					
					TestinfoTable test_info = new TestinfoTable(id,time,type,info);
					list.add( test_info );
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}
}
