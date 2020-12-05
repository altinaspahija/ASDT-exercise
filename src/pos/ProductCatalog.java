package pos;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ProductCatalog {

    private Map<Integer, ProductSpecification> specifications;

    public ProductCatalog(){
        specifications = new HashMap<Integer, ProductSpecification>();


        ProductSpecification prodspec;
        prodspec = new ProductSpecification(1, 1, "Water");
        specifications.put(1,prodspec);
        prodspec = new ProductSpecification(2, 2, "Cola");
        specifications.put(2,prodspec);

    }

    public ProductSpecification getProductSpecification (Integer itemID)
    {
        return specifications.get(itemID);
    }


}
