import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/wiley1"; 
		Connection con = DriverManager.getConnection(url,"root","pournimak");
		System.out.println("Connection Established !!");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM emp");
		while(rs.next()){
			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getInt(4)	+ " , " + rs.getInt(4));
	System.out.println(rs.getInt("empId") + " , " + rs.getString("empName") + " , "
			+ rs.getInt("empDepartmentid") + rs.getInt("empSalary") + rs.getInt("manager_id"));
	      }
	}

}

