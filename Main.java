public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human hum1 = new Human("Василий");
        Human hum2 = new Human("Петр");

        market.acceptToMarket(hum1);
        market.acceptToMarket(hum2);
        System.out.println("-------------------");
        market.takeInQueue(hum1);
        market.takeInQueue(hum2);
        System.out.println("-------------------");
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        if (hum1.isMakeOrder) {System.out.println(hum1.name+" сделал заказ");}
        if (hum1.isTakeOrder) {System.out.println(hum1.name+" получил заказ");}
        if (hum2.isMakeOrder) {System.out.println(hum2.name+" сделал заказ");}
        if (hum2.isTakeOrder) {System.out.println(hum2.name+" получил заказ");}
        System.out.println("-------------------");
        market.releaseFromMarket();
    }
}
