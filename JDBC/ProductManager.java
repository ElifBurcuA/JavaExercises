package homework4B;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductManager {   //veritabanına kayıtları eklemek,güncellemek, silmek vb.
	
	public boolean insert(Product product) throws Exception {   //insert edeceğimiz nesneye ait bilgileri product sınıfından alıyoruz
		
		
		Connection connection=DatabaseUtilities.getConnection();
		
		String sql="""
				insert into "Product"("productName","salesPrice") values(?,?)
				
				""";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setLong(1,product.getProductId());
		statement.setString(2, product.getProductName());
		statement.setDouble(3, product.getSalesPrice());
		int affected=statement.executeUpdate();
				
			
		connection.close();
		return affected==1?true:false;
		
	}
	
	public Product find(long productId) throws Exception {
		Product product=null;
		
		Connection connection=DatabaseUtilities.getConnection();
		
		String sql="""
				insert into "Product"("productName","salesPrice") values(?,?)
				
				""";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setLong(2, productId);
		ResultSet resultSet=statement.executeQuery();
		if(resultSet.next()) {
			product=new Product();
			product.setProductId(resultSet.getLong("productId"));
			product.setProductName(resultSet.getString("productName"));
			product.setSalesPrice(resultSet.getDouble("salesPrice"));
			
		}
		connection.close();
		
		
		return product;
	}
	
	
	

}
