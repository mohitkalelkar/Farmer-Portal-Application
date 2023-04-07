package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		    PrintWriter pw=res.getWriter();
		    res.setContentType("text/html");
		   
		    int ab=new LoginDAO().insert(req);
		    System.out.print(ab);
		    if(ab==0) {
		    	pw.println(" <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'>"
		    			+ "  <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'></script>");
		    	pw.println("<div class='alert alert-danger alert-dismissible fade show'>");
				pw.println("<button type='button' class='btn-close' data-bs-dismiss='alert'></button>");				
				pw.println("Invalid login Credentials");
				pw.println("</div>");
		    	RequestDispatcher rd=req.getRequestDispatcher("Logins.html");
		    	rd.include(req, res);
		    }
		    else {
		    	pw.println(" <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'>"
		    			+ "  <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'></script>");
		    	pw.println("<div class='alert alert-success alert-dismissible'>");
				pw.println("<button type='button' class='btn-close' data-bs-dismiss='alert'></button>");
				pw.println("Welcome ");
				pw.println("</div>");
		    	RequestDispatcher rd=req.getRequestDispatcher("schems.html");
		    	rd.include(req, res);
//				Cookie ck= new Cookie("uname", ab.getUserName());
//				res.addCookie(ck);
				
			}
		    
	}
}
