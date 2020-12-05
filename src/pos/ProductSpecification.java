package pos;

public class ProductSpecification {

    private Integer itemID;
    private double price;
    private String description;

    public ProductSpecification (Integer itemID, double price, String description)
    {
        this.itemID = itemID;
        this.price = price;
        this.description = description;
    }

    public int getItemID() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }



}
