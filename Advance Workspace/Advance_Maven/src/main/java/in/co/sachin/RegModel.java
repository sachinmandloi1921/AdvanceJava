package in.co.sachin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegModel extends Regbean {

	public void add(Regbean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("insert into mandloi values(?,?,?,?,?,?,?,?)");
		
		ps.setString(1,bean.getId());
		ps.setString(2,bean.getFirstName());
		ps.setString(3,bean.getLastName());
		ps.setString(4,bean.getLogin());
		ps.setString(5,bean.getPassword());
		ps.setString(6,bean.getGender());
		ps.setDate(7,new java.sql.Date(bean.getDOB().getTime()));
		ps.setString(8,bean.getMobileNo());
		
		int i = ps.executeUpdate();

		conn.commit();

		System.out.println(i + ":Record Inserted");

		ps.close();
		conn.close();

	}
	public Regbean Authenticate(String a, String b) throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin","root" , "root");
		 PreparedStatement prst = conn.prepareStatement("select * from mandloi where id = ? and password =?");
		 
		 prst.setString(1, a);
		 prst.setString(2, b);
		 
		 ResultSet rs=prst.executeQuery();
		 Regbean rb= new Regbean();
		 while (rs.next()) {
			 rb.setId(rs.getString(1));
			 rb.setFirstName(rs.getString(2));
			 rb.setLastName(rs.getString(3));
			 rb.setLogin(rs.getString(4));
			 rb.setPassword(rs.getString(5));
			 rb.setGender(rs.getString(6));
			 rb.setDOB(rs.getDate(7));
			 rb.setMobileNo(rs.getString(8));
			 
		 }
	 return rb;


	}


}	
	

