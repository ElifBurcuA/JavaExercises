package homework4B;



public class ProductInsertTest {
	public static void main(String[] args) throws Exception {
		Product product=new Product(0,"Eğitim Seti",100);
		ProductManager manager=new ProductManager();    //bu kaydı veritabanına ekleyecek sınıfımızı yapıyoruz
		manager.insert(product);
		boolean inserted=manager.insert(product);
		System.out.println("Eklendi mi?"+inserted);
		
		
	}

}
