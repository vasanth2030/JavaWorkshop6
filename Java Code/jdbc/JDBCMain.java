package jdbc;

//1. Import the package
import java.sql.*;

public class JDBCMain {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mysql_work_shop";
		String uname="hbstudent";
		String pass="hbstudent";
		
		//2. Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//3. Establish a connection
		Connection con= DriverManager.getConnection(url, uname, pass);
		
		//4. Create a statement
		Statement st= con.createStatement();
		
		//5. Execute the query
		ResultSet rs= st.executeQuery("select * from student");
		
		//int n = st.executeUpdate("insert into student values(22,'Yuvaraj','yuvi@gmail.com',22)");
		
		//6. Process the results
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+
					" "+rs.getString(3)+" "+rs.getInt(4));
			System.out.println();
		}
		
		//7. Close the connection
		con.close();	
	}
}
