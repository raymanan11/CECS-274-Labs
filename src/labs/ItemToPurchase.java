package labs;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase(){
        itemName = "";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public String getName() {
        return this.itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getPrice() {
        return this.itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public int getQuantity() {
        return this.itemQuantity;
    }
}
