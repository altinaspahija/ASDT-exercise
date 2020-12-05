package pos;

public class Register
{
    private int registerNumber;
    private ProductCatalog productCatalog;
    private Sale sale;
    private Store store;
    public Register( ProductCatalog productCatalog )
    {
        this.productCatalog = productCatalog;
    }
    public void endSale()
    {
        sale.becomeComplete();
    }
    public void enterItem( Integer id, int quantity )
    {
        ProductSpecification prodspec = productCatalog.getProductSpecification( id );
        sale.makeLineItem( prodspec, quantity );
    }
    public void makeNewSale()
    {
        sale = new Sale();
    }
    public void makePayment( Money money )
    {
        sale.makePayment( money );
    }
}

