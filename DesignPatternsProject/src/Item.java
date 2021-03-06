

/**
 *
 * @author Aleks
 */
public class Item {

    private String itemCode;
    private int price;
    private User user;

    public Item(User user, String upc, int cost) 
    {
        this.itemCode = upc;
        this.price = cost;
        this.user = user;
    }

    public String getUpcCode() 
    {
        return itemCode;
    }

    public int getPrice() 
    {
        return price;
    }
}
