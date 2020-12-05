package pos;

public class SalesLine {
    private int quantity;

    private ProductSpecification prodspec;
    public SalesLine (ProductSpecification prodspec, int quantity)
    {
        this.prodspec = prodspec;
        this.quantity = quantity;
    }

    public double getSubTotal(){
        return prodspec.getPrice() * quantity;
    }
}
