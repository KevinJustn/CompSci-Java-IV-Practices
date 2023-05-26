public class Sell implements Order{ 
   private String tickerSymbols;
   private int quantity;
   private Broker b;
   
   public Sell(String tickerSymbols, int quantity, Broker b) { 
      this.tickerSymbols = tickerSymbols;
      this.quantity = quantity; 
      this.b = b;
   }
   
   public void execute() { 
      b.sell(tickerSymbols, quantity);
   }
   
   public void undo() { 
      b.buy(tickerSymbols, quantity);
   }
}