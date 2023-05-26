import java.util.*;
public class Memento { 
   private static Stack<Order> past = new Stack<Order>();
   private static Stack<Order> future = new Stack<Order>();
   
   public static void redo() { 
      if (!future.empty()) { 
         Order o = future.pop(); 
         o.execute();
         past.push(o);
      }
   } 
   
   public static void undo() { 
      if (!past.empty()) { 
         Order o = past.pop(); 
         o.undo();
         future.push(o);
      }
   }
   
   public static Order add(Order o) { 
      past.push(o);
      return o;
   }
}