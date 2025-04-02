public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);
        orderQueue.addOrder(5);
        orderQueue.addOrder(5);
        orderQueue.addOrder(8);

        System.out.println(orderQueue);
        orderQueue.fulfillAll();
        System.out.println(orderQueue);

        orderQueue.addStock(10);
        orderQueue.addOrder(3);
        orderQueue.addOrder(3);
        orderQueue.addOrder(5);
        
        orderQueue.fulfillAll();
        System.out.println(orderQueue);
    }
}
