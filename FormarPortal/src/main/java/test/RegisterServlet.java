 package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		 res.setContentType("text/html");
		RegisterBean rb=new RegisterBean();
		rb.setUname(req.getParameter("uname"));
		rb.setPass(req.getParameter("pass"));
		rb.setFname(req.getParameter("fname"));
		rb.setLname(req.getParameter("lname"));
		rb.setAddr(req.getParameter("addr"));
		rb.setPno(Long.parseLong(req.getParameter("pno")));
		rb.setMid(req.getParameter("mid"));
		rb.setKno(Integer.parseInt(req.getParameter("kno")));
		rb.setKsra(Integer.parseInt(req.getParameter("ksra")));
		rb.setArea(req.getParameter("area"));
		rb.setNrt(req.getParameter("nrt"));
		rb.setSth(req.getParameter("sth"));
		rb.setEst(req.getParameter("est"));
		rb.setWst(req.getParameter("wst"));
		InsertDAO id=new InsertDAO();
		 int k=id.insert(rb);
		 if(k>0)
		 {
			 pw.println("data inserted successfull....");
			 RequestDispatcher rd=req.getRequestDispatcher("home.html");
		    	rd.include(req, res);
			 
			 
		 }else {
			 pw.print("Not Inserted...");
		 }
		
		
	}

}
