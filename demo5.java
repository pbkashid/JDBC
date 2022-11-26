import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo5 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con = MyConnection.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into user values(?,?)");
		
		con.setAutoCommit(false);
		pst.setString(1, "abc");
		pst.setString(2, "abc123");
		pst.addBatch();
		
		pst.setString(1, "pqr");
		pst.setString(2, "pqr123");
		pst.addBatch();
		
		pst.executeBatch();
		con.commit();
	}
}
