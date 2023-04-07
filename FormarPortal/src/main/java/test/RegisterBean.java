package test;
import java.util.*;
import java.io.*;
public class RegisterBean implements Serializable {
	

	private String uname;
	private String pass;
	private String fname;
	private String lname;
	private String addr;
	private String mid;
	private String area;
	private String nrt;
	private String sth;
	private String est;
	private String wst;
	
	private long pno;
	private int ksra,kno;
	
	public RegisterBean() {
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNrt() {
		return nrt;
	}
	public void setNrt(String nrt) {
		this.nrt = nrt;
	}
	public String getSth() {
		return sth;
	}
	public void setSth(String sth) {
		this.sth = sth;
	}
	public String getEst() {
		return est;
	}
	public void setEst(String est) {
		this.est = est;
	}
	public String getwst() {
		return wst;
	}
	public void setWst(String wst) {
		wst = wst;
	}
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	public int getKsra() {
		return ksra;
	}
	public void setKsra(int ksra) {
		this.ksra = ksra;
	}
	public int getKno() {
		return kno;
	}
	public void setKno(int kno) {
		this.kno = kno;
	}
		

}
