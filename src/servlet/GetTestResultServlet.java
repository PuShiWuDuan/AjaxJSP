package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sql.IPV6SqlSearch;
import sql.TestinfoTable;
import GlobalConfig.config;
@WebServlet("/GetTestResultServlet")
public class GetTestResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName").trim();
		if(userName == null || "".equals(userName)){
			userName = "Guest";
		}
		
		//String greetings = "Hello " + userName;
		String chosed = request.getParameter("chosed").trim();
		response.setContentType("text/plain");
		//Process p = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c", "sudo ./a.out greetings > output.txt"});
		response.getWriter().write("output.txt"+chosed);
		System.out.println("-------"+chosed+"-----");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		//qingchu  cache
		response.setHeader("Cache-Control", "no-store"); 
        response.setHeader("Pragrma", "no-cache");         
        response.setDateHeader("Expires", 0);  
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=out.txt");
		PrintWriter out = response.getWriter();
		//获取选中的测试案例
		String chosed = request.getParameter("chosed").trim();
		System.out.println(chosed+"----------------");
		//执行Ｃ＋＋可执行文件
		try
		{
				Runtime.getRuntime().exec(new String[]{"/bin/sh","-c", " cd "+config.getPath()+request.getContextPath()+" && ./test "+chosed});
		}
		catch(RuntimeErrorException e)
		{
				e.printStackTrace();
		}
		//out.println("./test"+chosed);
		//System.out.println("-------"+chosed+"-----");
        //获取Ｃ++后台执行的结果集
		List<TestinfoTable> Test_InfoList = IPV6SqlSearch. getTest_InfoList();
		for(TestinfoTable t: Test_InfoList)
		{
			 //System.out.println(t.getId());
			  //out.println(t.getId()+""+t.getTime()+t.getType()+t.getInfo());
		      out.println("<a class=\"col-md-3\" >"+t.getId()+"</a>"); 
			  out.println("<a class=\"col-md-1\">"+t.getType()+"</a>");
			  out.println("<a class=\"col-md-6\" href=\"servlet/GetParsePacketServlet?id="+t.getId()+"\">"+t.getInfo()+"</a>");
        }
		out.flush();
	}
}
/**
 *         String fName = "/home/liujianfei/java_web/AjaxJSP/output";
        //out.println("In Japanese:");
		 List<String> list = new ArrayList<String>();       
		 list.add( "first" );       
		 list.add( "second" );       
		 JSONArray jsonArray2 =  JSONArray.fromObject( list );     
 *         try {
          FileInputStream fis =
            new FileInputStream(fName);
          InputStreamReader isr = new InputStreamReader(fis);
          @SuppressWarnings("resource")
		  BufferedReader reader = new BufferedReader(isr);
          String line = null;
          while ((line = reader.readLine()) != null) {
          }
        //  Rand i=new Ra
          for(int i=1;i<Math.random()*100;i++)
          {
	          out.println("<div class=\"col-md-3\">0.0000"+i+"</div>"); 
	          //out.println("<div class=\"col-md-3\">"+line+"</div>"); 
			  out.println("<div class=\"col-md-1\">"+"INFO"+"</div>");
			  out.println("<div class=\"col-md-8\">"+"Node ff:fe:90:99->dd:ff:dd:ss"+"</div>");
          }
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
        }
 */