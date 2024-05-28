import java.sql.*;

public class UserControl {
	   MySQLConnection mysql = null;
	   
	   public UserControl() {
		   mysql = new MySQLConnection("product_db_test", "root","1234");
		   mysql.dbConnect();
		   
	   }
	   public boolean login(String uname, String upass) {
		   try {
			   String query = "SELECT * FROM product_db_test1.users WHERE pass = md5('" + upass +"')";
			   ResultSet temp = mysql.getResult(query);
			   while(temp.next()){
				   if(uname.equals(temp.getString(2))){
					   mysql.dbClose();
					   return true;
				   }
				   
			   }
			   return false;
		   }catch(Exception e) {
			   return false;
		   }
		   }
	   }


