public class TestOrders {
    public static void main (String[] args) {

        // Items
        Items item1 = new Items();
        item1.name = "mocha"; // assigning name
        item1.price = 3.50;   // assigning price

        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 4.50;

        Items item3 = new Items();
        item3.name = "drip coffee";
        item3.price = 2.50;

        Items item4 = new Items();
        item4.name = "capuccino";
        item4.price = 5.00;

        // Orders
        Orders order1 = new Orders();
        System.out.println(order1.total);
        order1.name = "Cam"; // assigning name

        Orders order2 = new Orders();
        order2.name = "Jimmy";

        Orders order3 = new Orders();
        order3.name = "Noah";

        Orders order4 = new Orders();
        order4.name = "Sam";

        // Add
        order2.itemsArray.add(item1);
        order2.total += item1.price;
        System.out.println("Order2 total: " + order2.total);

        order3.itemsArray.add(item4);
        order3.total += item4.price;
        System.out.println("Order3 total: " + order3.total);

        order4.itemsArray.add(item2);
        order4.total += item2.price;
        System.out.println("Order4 total: " + order4.total);

        order4.itemsArray.add(item2);
        order4.total += 2 * item2.price;
        System.out.println("Order4 total updated: " + order4.total);

        // Order Rready
        order1.ready = true;
        System.out.println("Order1 status: " + order1.ready);

        order2.ready = true;
        System.out.println("Order2 status: " + order2.ready);
    }
}
