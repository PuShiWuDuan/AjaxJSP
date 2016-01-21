package servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import GlobalConfig.config;
import ViewJSP.ReadDirs;
@SuppressWarnings("serial")
public class GetRunTestSevelet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetRunTestSevelet() {
		super();
	}
   public static ArrayList<ReadDirs.Node> res;
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
		doPost(request,response);
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

		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String TestDir = request.getParameter("TestDir").trim();
		File f = new File(config.getPath()+request.getContextPath()+"/TestSuites/"+TestDir);
        res=new ArrayList<ReadDirs.Node>();
        ReadDirs.tree(f,config.getPath()+request.getContextPath()+"/TestSuites/"+TestDir,res,0);
        response.sendRedirect(request.getContextPath()+"/ipv6_index.jsp");
        System.out.println(TestDir);
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
