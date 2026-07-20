import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/payroll";
	private static final String USER = "root";
	private static final String PASSWORD = "gopi2k5";
	
	public static Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			return con;
		}
		catch(SQLException e) {
			System.out.println("Database Connection Failed !");
			e.printStackTrace();
			return null;
		}
	}
}