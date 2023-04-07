package test;
import java.io.*;
public class LoginBean implements Serializable {
	private String userName;
	private String pass;
	public LoginBean()
	{
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
