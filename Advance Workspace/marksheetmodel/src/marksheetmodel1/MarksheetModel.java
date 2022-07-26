package marksheetmodel1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarksheetModel {


	public void Add(javabean bean) throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("in.co.bundle.rb.resource");
		System.out.println(rb.getString("com.mysql.jdbc.Driver"));
		
		Class.forName(rb.getString("Driver"));
		 
		 Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		 
		conn.setAutoCommit(false);
		
		PreparedStatement ps =conn.prepareStatement("Insert into marksheet values(?,?,?,?)");
		
	
		
	
		ps.setInt(1,bean.getRollno());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getPhysics());
		ps.setInt(4,bean.getChemistry());
		ps.setInt(5,bean.getMaths());
		
		ps.executeUpdate();
		
		conn.commit();
		conn.close();
		ps.close();
		 
	}

	public void Update(javabean b) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetbean","root","root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("Update marksheet set  name = ?, physics = ?, chemistry = ? , maths = ? where Rollno= ?");
		
		
		ps.setInt(1, b.getRollno());
		ps.setString(2, b.getName());
		ps.setInt(3,b.getPhysics());
		ps.setInt(4,b.getChemistry());
		ps.setInt(5,b.getMaths());
		 
		 
		
		ps.executeUpdate();
		
		conn.commit();
		ps.close();
		conn.close();
	
	}

	public void Delete(javabean c) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetbean","root","root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("Delete from marksheet where Rollno= ?");
		
		
		ps.setInt(1,c.getRollno()); 
 
		
		 
		
		ps.executeUpdate();
		
		conn.commit();
		ps.close();
		conn.close();
}
	
	public List <javabean> get(javabean a) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetbean","root","root");
		
		
		PreparedStatement ps = conn.prepareStatement(" SELECT * from marksheet where Rollno= ?");
		
		ps.setInt(1,a.getRollno());
		
		 ResultSet rs = ps.executeQuery();
		 
		 ArrayList<javabean>list = new ArrayList<javabean>();
		
		 while (rs.next()) {
	
			 javabean mb = new javabean();
	    mb.setRollno(rs.getInt(1));	 
		mb.setName(rs.getString(2));
		mb.setPhysics(rs.getInt(3));
		mb.setChemistry(rs.getInt(4));
		mb.setMaths(rs.getInt(5));
		
		 
		 
		 }
		
		ps.close();
		conn.close();
		
		return list;
}
	public List<javabean> search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetbean", "root", "root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from marksheet");
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<javabean> list = new ArrayList<javabean>();
		
		while (rs.next()) {

			javabean bean1 = new javabean();
			
			bean1.setRollno(rs.getInt(1));
		    bean1.setName(rs.getString(2));
			bean1.setPhysics(rs.getInt(3));
			bean1.setChemistry(rs.getInt(4));
			bean1.setMaths(rs.getInt(5));
			list.add(bean1);
		}
		return list;
	}
	public List<javabean> getMeritList() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetbean", "root", "root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select *, ((physics + chemistry + maths)/3) as percentage from marksheet where (physics > 40 AND chemistry > 40 AND Maths > 40) order by (physics + chemistry + maths) desc");
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<javabean> list = new ArrayList<javabean>();
		
		while (rs.next()) {

			javabean bean1 = new javabean();
			
			bean1.setRollno(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setPhysics(rs.getInt(3));
			bean1.setChemistry(rs.getInt(4));
			bean1.setMaths(rs.getInt(5));
			list.add(bean1);
		}
		return list;
	}
}
	


