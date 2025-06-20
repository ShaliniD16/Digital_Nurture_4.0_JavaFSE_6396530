public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, String productName){
        for(Product product:products){
            if(product.getProductName().equalsIgnoreCase(productName)) return product;
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String productName){
        int low = 0, high = products.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int com = products[mid].getProductName().compareToIgnoreCase(productName);
            if(com==0) return products[mid];
            else if(com<0) low = mid+1;
            else high = mid-1;
        }
        return null;
    }
}
