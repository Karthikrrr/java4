import java.util.*;
import java.io.*;
import java.text.DateFormat;


import javax.servlet.*;
//import javax.servlet.Servlet;
//import java.text.*;
//import javax.servlet.*;
//import javax.*;


@WebServlet("/WebServlet")
public class AutoRef extends  HttpServlet implements servlet
{
	protected void service(HttpServletRequest request,HttpServletResponse response) throwsServletException,IoException	
	{
	double price1=1,price2=1.1;
	response.setIntHeader("Refresh",5);
	DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date=new Date();
	
	price1=price*43;
	price2=price*12;
	
	StringBuilder sb=new StringBuilder();
	sb.append("<html>");
	sb.append("<body");
	sb.append("<h1>" +"auto ref"+"</h1>");
	sc.append("<h2> curret time is: </h2>"+dateFormat.format(date))
		.append("<table>")
		.append("<tr>")
		.append("<th>stock><th>")
		.append("<th> price</th>")
		.append("<tr>")
		.append("<tr> <td> ABC</td>+"+price1+"+</tr>")
		.append("<tr><td>XYZ</td>+"+price2 +"</tr>")
		.append("</table>")
		.append("</body>")
		.append("</html>");
	response.getWriter().write(sb.toString());
	
	
	}
}
