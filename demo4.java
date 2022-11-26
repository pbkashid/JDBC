import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class demo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		Connection con = MyConnection.getConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		ResultSetMetaData rsmetadata =rs.getMetaData();
		
		System.out.println(rs.getMetaData.getColumnCount());
		for(int i=1;i<=rsmetadata.getColumnCount();i++);
		{
			System.out.println(rs.getMetaData.getColumnName(i));
		}
		
		
	}

}
