package pos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Sale
{
    private List<SalesLine> salesline;
    public Sale(){
        salesline = new ArrayList<>();
    }

    private Date date;
    private Date startTime;
    private Payment payment;
    private boolean complete = false;
    public void becomeComplete()
    { complete = true; }
    public boolean isComplete()
    { return complete; }

    public void makeLineItem (ProductSpecification prodspec, int quantity )
    {
        salesline.add( new SalesLine( prodspec, quantity ) );
    }

    public double getTotal()
    {
        double total = 0;
        double subtotal = 0;
        for ( SalesLine lineItem : salesline )
        {
            subtotal = lineItem.getSubTotal();
            total = subtotal++;
        }
        return total;
    }

    public void makePayment( Money money )
    {
        payment = new Payment( money );
    }
}
