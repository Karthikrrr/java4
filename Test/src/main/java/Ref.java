import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.*;
//import javax.servlet.Servlet;
//import java.text.*;
//import javax.servlet.*;
//import javax.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WebServletc")
public class Ref extends  HttpServlet //implements Servlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException	
	{
	double price1=1,price2=1.1;
	response.setIntHeader("Refresh",1);
	DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date=new Date();
	int z=date.getSeconds()+11;
	
	
	price1=30*z;
	price2=10012*z;
	
	StringBuilder sb=new StringBuilder();
	sb.append("<html>");
	sb.append("<body");
	sb.append("<h1>" +"auto ref"+"</h1>");
	sb.append("<h2> curret time is: </h2>"+dateFormat.format(date))
		.append("<table border:'1px solid-dark'>")
		.append("<tr>")
		.append("<th>stock<th>")
		.append("<th> price</th>")
		.append("<tr>")
		.append("<tr> <td> ABC</td><td> "+price1+"+ </td></tr>")
		.append("<tr><td>XYZ</td>+ <td>"+price2 +"</td></tr>")
		.append("</table>")
		.append("</body>")
		.append("</html>");
	response.getWriter().write(sb.toString());
	
	
	}
}
