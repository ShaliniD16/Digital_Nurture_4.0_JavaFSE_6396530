import java.util.*;
public class SearchEngine {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Book", "Stationery")
        };
        System.out.println("Linear Search Engine: ");
        Product linearResult = SearchAlgorithms.linearSearch(products,"Phone");
        if(linearResult==null) System.out.println("Phone not found");
        else System.out.println(linearResult+ " found");


        Arrays.sort(products);
        System.out.println("Binary Search Engine");
        Product binaryResult = SearchAlgorithms.binarySearch(products,"Shoes");
        if(binaryResult==null) System.out.println("Shoes not found");
        else System.out.println(binaryResult+" found");
    }


}
