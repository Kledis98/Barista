public class TestingFile{
    public static void main(String[] args){


        Item item1 = new Item("moccha", 2.5);
        Item item2 = new Item("latte", 1.25);
        Item item3 = new Item("drip Coffee", 4.85);
        Item item4 = new Item("cappuccino", 5.00);

        Order Order1 = new Order();
        Order Order2 = new Order();

        Order Order3 = new Order("A");
        Order Order4 = new Order("B");
        Order Order5 = new Order("C");

        Order1.addItem(item1);
        Order1.addItem(item2);

        Order2.addItem(item1);
        Order2.addItem(item4);
        Order2.display();

        Order3.addItem(item3);
        Order3.addItem(item2);

        Order4.addItem(item4);
        Order4.addItem(item2);
        Order4.display();

        Order5.addItem(item3);
        Order5.addItem(item4);


        Order2.setReady(false);
        System.out.println(Order2.getStatusMessage());

        System.out.println(Order5.getOrderTotal());
        Order5.display();

    }
}