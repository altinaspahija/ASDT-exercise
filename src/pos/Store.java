package pos;

import java.util.ArrayList;
import java.util.List;

public class Store
{
    private ProductCatalog productCatalog = new ProductCatalog();
    private Register register = new Register( productCatalog );
    public Register getRegister() { return register; }
    private List<Sale> sale;
    public Store(){
        sale = new ArrayList<>();
    }
    public void addSale(){
       sale.add(new Sale());
        }
}