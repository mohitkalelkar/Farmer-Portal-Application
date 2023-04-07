package test;
import java.io.*;
import java.sql.*;
public class InsertDAO {
	public int k=0;
	public int insert(RegisterBean rb)
	{
		try {
			Connection con=DBConnectio.getCon();
		PreparedStatement ps=con.prepareStatement("insert into farmerdetails50 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,rb.getUname());
			ps.setString(2,rb.getPass());
			ps.setString(3,rb.getFname());
			ps.setString(4,rb.getLname());
			ps.setString(5,rb.getAddr());
			ps.setLong(6,rb.getPno());
			ps.setString(7,rb.getMid());
			ps.setInt(8,rb.getKno());
			ps.setInt(9,rb.getKsra());
			ps.setString(10,rb.getArea());
			ps.setString(11,rb.getNrt());
			ps.setString(12,rb.getSth());
			ps.setString(13,rb.getEst());
			ps.setString(14,rb.getwst());
			k=ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
