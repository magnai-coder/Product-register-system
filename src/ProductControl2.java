import java.sql.PreparedStatement;
import java.sql.*;

import java.sql.ResultSet;

public class ProductControl2 {
	private MySQLConnection mysql=null;
		
	
	public ProductControl2() {
		mysql = new MySQLConnection("product_db_test1","root", "1234");
		mysql.dbConnect();
		
			
		}
	
	public Added_product[] getProduct() {
		try {		
			String count ="SELECT count(*) AS too FROM product_db_test1.add";
			ResultSet c = mysql.getResult(count);
			int size = 0;
			while(c.next()){
				size = c.getInt("too");
			}
//		
			Added_product[] products = new Added_product[size];
			String query = "SELECT * FROM product_db_test1.add;";
			ResultSet temp = mysql.getResult(query);
				
			int i = 0;
			while(temp.next()) {
				String name = temp.getString(1);
				double price =temp.getDouble(2);
				String psize =temp.getString(3);
				int number =temp.getInt(4);
				
				Added_product newProduct = new Added_product(name, price, psize, number);
				products[i] = newProduct;
				i++;
			}
			return products;
			
		}catch(Exception e) {
			return null;
		}
	}
	   
	public boolean addProduct(Added_product newProduct) {
		boolean add =false;
		try {
			String query = "INSERT INTO `product_db_test1`.`add` (`name`, `price`, `size`, `number`) VALUES (?, ?, ?, ?);";
		    PreparedStatement pst = mysql.getConnection().prepareStatement(query);
		    pst.setString(1, newProduct.getName());
		    pst.setDouble(2, newProduct.getPrice());
		    pst.setString(3, newProduct.getSize());
		    pst.setInt(4, newProduct.getNumber());
		    pst.execute();
		    add = true;
		    return add;
		}catch(Exception e){	
			return false;
		}
	}
	public boolean deleteProduct(int code) {
		 boolean deleted = false;
		 try { code = 1;
	     String query = "TRUNCATE TABLE `product_db_test1`.`add`";
		 PreparedStatement pst = mysql.getConnection().prepareStatement(query);
		 pst.execute();
		 deleted = true;
		 return deleted;
		 }catch( Exception e) {
			 return false;
		 }
		 
	 }
	}

	

	 
 



