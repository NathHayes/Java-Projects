public class CustomerOrder {
    private String name;
    private String date;
    private int quantity;

    public CustomerOrder() {
        this.name = "";
        this.date = "";
        this.quantity = 0;
    }
    public CustomerOrder(int quantity) {
        this.quantity = quantity;
    }
    public CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipProduct() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return ""+quantity;
    }
}

