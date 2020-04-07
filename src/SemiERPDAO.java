import java.sql.*;

public class SemiERPDAO {

	// Database Connection
	public Connection dbConn() {
		Connection conn = null;
		try {

			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(
					"jdbc:mysql://semierp.cmccxwv3gj1s.ap-northeast-2.rds.amazonaws.com/semierp:3306?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"admin", "semicolon");

			// close a connection
			conn.close();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return conn;
	}
	
}
