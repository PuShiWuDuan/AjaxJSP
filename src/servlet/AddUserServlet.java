package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sql.SqlConn;
import sql.UserTable;

import com.mysql.jdbc.PreparedStatement;

@SuppressWarnings("serial")
public class AddUserServlet extends HttpServlet {

	private static Boolean  CheckExsist(String username) {
		java.sql.Connection conn =SqlConn. getConn();
		String sql = "select * from user_info";
		//ArrayList<User> list = new ArrayList<User>();
		
		PreparedStatement pstmt;
		/*取得数据库操作对象
		System.out.println(username);
		System.out.println(password);
		*/
		try {
			// 查询数据库对象,返回记录集(结果集)
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			//循环记录集，查看每一行每一列的记录
			while (rs.next()){
				// 第一列username
				String user = rs.getString(1);
			//   System.out.println(user);
				//System.out.println(rs.getString(1));
				if(username.compareTo(user)==0)
				{
					System.out.println(rs.getString(1));
					return false;
				}        
				
			}
		}catch (SQLException e) {
			e.printStackTrace();		    
		}
		return true;   
	}
	
	public static int insert(UserTable uu) {
		java.sql.Connection conn =SqlConn. getConn();
		int i = 0;
		String sql = "insert into user_info (username,password) values(?,?)";
		PreparedStatement pstmt;   //PreparedStatement类对象支持带参数的sql语句的执行
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1,uu.getUsername());
			
			pstmt.setString(2, uu.getPassword());
			i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("passwd2");
		PrintWriter out=response.getWriter();
		Boolean flag = CheckExsist(username);
		if(flag)
		{
			UserTable u=new UserTable(username,password);
			insert(u);
		    out.println("<script>alert(\"ok\")</script>");
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/yonghuzhuce.jsp");
			
			response.setContentType("text/html;charset utf-8");
			out.println("<strong>Sorry,the name exsist!please input again!</strong>");
		}
	}

}
