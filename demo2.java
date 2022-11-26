import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class demo2 {
	  
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/student"; 
		Connection con = DriverManager.getConnection(url,"root","pournimak");
		System.out.println("Connection Established !!");

	
		Statement st =con.createStatement();
		ResultSet rs =st.executeQuery("SELECT * FROM student");
			while(rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
			System.out.println(rs.getInt("Stud_id")+" , " + rs.getString("Fname") + " , " + rs.getString("Lname") + ",");
				
			}
			
        
	}
	

}
