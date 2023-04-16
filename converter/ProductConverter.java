package homework3A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class ProductConverter {


    public void store(List<Product> productList,String path) throws IOException{

        FileWriter fw= new FileWriter(path);
        BufferedWriter writer=new BufferedWriter(fw);

        for(Product product: productList){
            writer.write(product.toString());
            writer.newLine();
        }

        writer.close();
        fw.close();

    }

    String format(Product product) {
        return null;
    }

    public List<Product> load(String path) throws Exception{
        List<Product> products=new ArrayList<>();

        FileReader fr= new FileReader(path);
        BufferedReader reader=new BufferedReader(fr);

        String line=null;
        while ((line = reader.readLine()) != null) {
            Product product = Product.parse(line);
            products.add(product);
        }

        reader.close();
        fr.close();

        return products;
    }



}
