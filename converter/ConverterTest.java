package homework3A;

public class ConverterTest {
    public static void main(String[] args) {
        Product product=new Product();
        ProductConverter productConverter=new ProductConverter();
        String line=productConverter.format(product);
    }
}
