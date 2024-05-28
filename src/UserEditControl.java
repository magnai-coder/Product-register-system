import java.sql.PreparedStatement;


import java.sql.ResultSet;

public class UserEditControl {
	private MySQLConnection mysql=null;
		
	
	public UserEditControl() {
		mysql = new MySQLConnection("product_db_test1","root", "1234");
		mysql.dbConnect();
		
			
		}
	
	public users[] getProduct() {
		try {		
			String count ="SELECT count(*) AS too FROM product_db_test1.users";
			ResultSet c = mysql.getResult(count);
			int size = 0;
			while(c.next()){
				size = c.getInt("too");
			}
//		
			users[] products = new users[size];
			String query = "SELECT * FROM product_db_test1.users;";
			ResultSet temp = mysql.getResult(query);
				
			int i = 0;
			while(temp.next()) {
				int pro_code = temp.getInt(1);
				String pro_name =temp.getString(2);
				String pro_type =temp.getString(3);
				
				users newProduct = new users(pro_code, pro_name, pro_type);
				products[i] = newProduct;
				i++;
			}
			return products;
			
		}catch(Exception e) {
			return null;
		}
	}
	   
	public boolean addProduct(users newProduct) {
		boolean added =false;
		try {
			String query = "INSERT INTO `product_db_test1`.`users` (`id`, `name`, `pass`) VALUES (?, ?,md5(?));";
		    PreparedStatement pst = mysql.getConnection().prepareStatement(query);
		    pst.setInt(1, newProduct.getCode());
		    pst.setString(2, newProduct.getName());
		    pst.setString(3, newProduct.getType());
		    pst.execute();
		    added = true;
		    return added;
		}catch(Exception e){	
			return false;
		}
	}
	
 public boolean deleteProduct(int code) {
	 boolean deleted = false;
	 try { String query = "DELETE FROM `product_db_test1`.`users` WHERE (`id` = '" + code +"');";
	 PreparedStatement pst = mysql.getConnection().prepareStatement(query);
	 pst.execute();
	 deleted = true;
	 return deleted;
	 }catch( Exception e) {
		 return false;
	 }
	 
 }
}


