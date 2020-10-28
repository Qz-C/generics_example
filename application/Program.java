package application;

import model.entities.Product;
import model.entities.Seller;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Product> products = new ArrayList<Product>();
        List<Seller> sellers = new ArrayList<Seller>();

        final String path = "C:\\temp\\products.csv";
        final String path2 = "C:\\temp\\sellers.csv";


        try(BufferedReader br = new BufferedReader(new FileReader(path));
        BufferedReader br1 = new BufferedReader(new FileReader(path2)))
        {
            String line = br.readLine();
            while( line != null ){
                String[] fields = line.split(",");
                products.add( new Product(fields[0], Double.parseDouble(fields[1])) );
                line = br.readLine();
            }
            line = br1.readLine();
            while( line != null ){
                String[] fields = line.split(",");
                sellers.add( new Seller(fields[0], Double.parseDouble(fields[1])) );
                line = br1.readLine();
            }

            //Generics used in the max function.
            System.out.println("The most expansive product:\n" + CalculationService.max(products));
            System.out.println("\nThe top seller:\n" + CalculationService.max(sellers));


        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
