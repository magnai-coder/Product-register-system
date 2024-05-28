import java.sql.*;

public class MySQLConnection {
	Connection conn = null;
	ResultSet rs = null;
	
	String serverUsername;
	String serverPassword;
	String connUrl = "jdbc:mysql://localhost:3306/";
	String serverName = "";
	
	public MySQLConnection(String dbname, String dbusername, String dbpass) {
		serverName = dbname;
		serverUsername = dbusername;
		serverPassword = dbpass;
	}
	
	public boolean dbConnect() {
		try {
			connUrl += serverName + "?userUnicode=true&characterEncoding=utf8";
			conn = DriverManager.getConnection(connUrl, serverUsername, serverPassword);
			
			if(conn != null)
				return true;
			else
				return false;
		} catch(Exception e) {
			return false;
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public ResultSet getResult(String query) {
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			return rs;
		} catch (Exception e) {
			return rs = null;
		}
	}
	
	public void dbClose() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
