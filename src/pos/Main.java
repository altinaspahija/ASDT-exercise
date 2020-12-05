package pos;

public class Main {

    public static void main(String[] args) {
        Sale sale = new Sale();
        ProductCatalog pc = new ProductCatalog();
        System.out.println(pc.getProductSpecification(1));
    }
}
