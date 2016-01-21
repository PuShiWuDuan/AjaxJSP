package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GlobalConfig.config;
import sql.ParsePacketInfoTable;

@SuppressWarnings("serial")
public class GetParsePacketServlet extends HttpServlet {

	private static ArrayList< ParsePacketInfoTable> parse;
	public static  ArrayList< ParsePacketInfoTable> getParse()
	{
		  return parse;
	}
	/**
	 * Constructor of the object.
	 */
	public GetParsePacketServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String infoPacket = sql.IPV6SqlSearch.getInfo_Capture_PacketList(id).trim();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		System.out.println(id);
		out.println(infoPacket);
		Process p = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c", " cd "+config.getPath()+request.getContextPath()+"&& sudo ./dissector  "+infoPacket});
		try {
			p.waitFor();
			//Thread.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		parse = sql.IPV6SqlSearch.getParsePacketList();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		for(int i=0;i<parse.size();i++)
		{
			//out.println("<script> alert("+parse.get(i).getInfo()+")</script>");
			out.println("<p> "+parse.get(i).getInfo()+"</p>");
		}
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
