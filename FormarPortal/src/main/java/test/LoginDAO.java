package test;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

public class LoginDAO {
	 int r ;

	public int insert(HttpServletRequest req) {
		try {

			Connection con = DBConnectio.getCon();
			PreparedStatement ps = con.prepareStatement("select * from farmerdetails50 where username=? and pass=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pass"));
			ResultSet k = ps.executeQuery();
			 if(k.next()) {
				r=1;
			 }		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

}
