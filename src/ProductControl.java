import java.sql.PreparedStatement;
import java.sql.*;

import java.sql.ResultSet;

public class ProductControl {
	private MySQLConnection mysql=null;
		
	
	public ProductControl() {
		mysql = new MySQLConnection("product_db_test1","root", "1234");
		mysql.dbConnect();
		}
	
	public Product[] getProduct() {
		try {		
			String count ="SELECT count(*) AS too FROM product_db_test1.product";
			ResultSet c = mysql.getResult(count);
			int size = 0;
			while(c.next()){
				size = c.getInt("too");
			}
//		
			Product[] products = new Product[size];
			String query = "SELECT * FROM product_db_test1.product;";
			ResultSet temp = mysql.getResult(query);
				
			int i = 0;
			while(temp.next()) {
				int pic = temp.getInt(1);
				String id =temp.getString(2);
				String name =temp.getString(3);
				double price =temp.getDouble(4);
				
				Product newProduct = new Product(pic, id, name, price);
				products[i] = newProduct;
				i++;
			}
			return products;
			
		}catch(Exception e) {
			return null;
		}
	}
	   
	public boolean addProduct(Product newProduct) {
		boolean added =false;
		try {
			String query = "INSERT INTO `product_db_test1`.`product` (`pic`, `product_id`, `name`, `price`) VALUES (?, ?, ?, ?);";
		    PreparedStatement pst = mysql.getConnection().prepareStatement(query);
		    pst.setInt(1, newProduct.getPic());
		    pst.setString(2, newProduct.getId());
		    pst.setString(3, newProduct.getName());
		    pst.setDouble(4, newProduct.getPrice());
		    pst.execute();
		    added = true;
		    return added;
		}catch(Exception e){	
			return false;
		}
	}
	

 public boolean updateProduct(Product pro) {
	 boolean updated = false;
	 try {
		 String query = "UPDATE `product_db_test1`.`product` "
		 		+ "SET `pic` = ?, `product_id` = ?, `name` = ?, `price` = ? WHERE (`product_id` = '" + pro.getId() +"');";
		 PreparedStatement pst = mysql.getConnection().prepareStatement(query);
		 pst.setInt(1, pro.getPic());
		 pst.setString(2, pro.getId());
		 pst.setString(3, pro.getName());
		 pst.setDouble(5, pro.getPrice());
		 pst.executeUpdate();
		 updated = true;
		 return updated;
	 } catch(Exception e) {
		 return false;
	 }
 }
 public boolean deleteProduct(int code) {
	 boolean deleted = false;
	 try { String query = "DELETE FROM `product_db_test1`.`product` WHERE (`product_id` = '" + code +"');";
	 PreparedStatement pst = mysql.getConnection().prepareStatement(query);
	 pst.execute();
	 deleted = true;
	 return deleted;
	 }catch( Exception e) {
		 return false;
	 }
	 
 }
}


