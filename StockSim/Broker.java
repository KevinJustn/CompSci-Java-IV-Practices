import java.util.*;
public class Broker { 
   private String name;

   public Broker(String name) { //constructor
      this.name = name;
   }
   
   public void buy(String tickerSymbols, int quantity) { //buy method
      System.out.println("Stock [ Name: " + tickerSymbols + ", Quantity: " 
      + quantity + " ] bought from " + name);
   }    
   
   public void sell(String tickerSymbols, int quantity) { //sell method
      System.out.println("Stock [ Name: " + tickerSymbols + ", Quantity: " 
      + quantity + " ] sold to " + name);
   }
   
   private List<Order> orderList = new ArrayList<Order>();
   
   public void takeOrder(Order order) { 
      orderList.add(order);
   }
   
   public void placeOrders() { 
      for(Order o: orderList)
         o.execute();
      
      orderList.clear();
   }

}