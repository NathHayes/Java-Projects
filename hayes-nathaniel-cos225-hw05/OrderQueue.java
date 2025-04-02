public class OrderQueue {
    private static class Node {
         CustomerOrder data;
        Node next;

        public Node(CustomerOrder data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, back;
    private int stock;

    public OrderQueue() {
        this.front = this.back = null;
        this.stock = 0;
    }

    public OrderQueue(int stock) {
        this.front = this.back = null;
        this.stock = stock;
    }

    public void addOrder(int quantity) {
        CustomerOrder order = new CustomerOrder(quantity);
        Node newNode = new Node(order);
        if (back != null) {
            back.next = newNode;
        }
        back = newNode;
        if (front == null) {
            front = newNode;
        }
    }
    public void addOrder(String name, String date, int quantity) {
        CustomerOrder order = new CustomerOrder(name, date, quantity);
        Node newNode = new Node(order);
        if (back != null) {
            back.next = newNode;
        }
        back = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public void addStock(int additionalStock) {
        stock += additionalStock;
    }

    public void fulfillOrder() {
        if (front != null && stock > 0) {
            front.data.shipProduct();
            stock--;
            if (front.data.getQuantity() == 0) {
                front = front.next;
                if (front == null) {
                    back = null;
                }
            }
        }
    }

    public void fulfillAll() {
        while (front != null && stock > 0) {
            fulfillOrder();
        }
    }

    @Override
    public String toString() {
        return (front == null) ? "Queue is empty" : front.data.toString();
    }
}