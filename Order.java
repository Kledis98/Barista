import java.util.ArrayList;

public class Order{
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    Order(){
        this.name="Guest";
        this.items = new ArrayList<Item>();
    }

    Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }


    public String getOrderName(){
        return name;
    }
    public void setOrderName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getAllOrders(){
        return items;
    }
    public void setAllOrders(ArrayList<Item> newItems){
        this.items = newItems;
    }

      public void addItem(Item Item){
        items.add(Item);
      }

      public String getStatusMessage(){
        if (ready){
            return  "Your order is ready.";
        }
        else {
           return "Thank you for waiting. Your order will be ready soon.";
        }
      }

      public double getOrderTotal(){
            double total = 0;
            for ( int i=0; i<items.size(); i++){
                total += items.get(i).getItemPrice();
            }
            // for(Item Item : items){
            //     total += Item.getItemPrice();
            // } 
            return total;
      }


    public void display(){
        System.out.println("Customer name is:" + name);
         for(Item Item : items){
            System.out.println(Item.getItemName()+" - $"+Item.getItemPrice());
        }
        System.out.println("Total: $"+ getOrderTotal());
    }
}