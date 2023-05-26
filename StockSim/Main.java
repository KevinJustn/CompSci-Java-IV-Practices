public class Main { 
   
   public static void main (String[] args) { 
      
      Broker b = new Broker("Fidelity");
      b.takeOrder( Memento.add( new Buy("GOOG", 9, b) ) );
      b.takeOrder( Memento.add( new Buy("AMZN", 1, b) ) );
      b.takeOrder( Memento.add( new Sell("GOOG", 8, b) ) );
      b.placeOrders();
      
      System.out.println();
      
      Memento.undo();
      Memento.undo();
      
      Memento.redo();
      
      Memento.undo();
      
      Memento.redo();
      Memento.redo();
   }
   
}