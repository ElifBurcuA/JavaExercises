package homework4B;


public class ProductFindTest {
	
	public static void main(String[] args) throws Exception{
		
		ProductManager manager=new ProductManager();
		long productId=2;
		Product product=manager.find(2);
		
		System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getSalesPrice());
	}

}
