import java.util.List;
import java.util.ArrayList;

public class Subject { 

   protected int state; //was private but needed update
   
   private List<Observer> observerList = new ArrayList<Observer>();
   
   public void attach(Observer observer) { 
      // add observer to observer list 
      observerList.add(observer); // the address is stored
         if(!observerList.contains(observer)) observerList.add(observer);
   }
   
   public void detatch(Observer observer) { 
      observerList.remove(observer);
   }
   
   public void setState(int state) { 
      this.state = state;
      notifyAllObservers();            // invoke notify AllObservers
   }
   
   private void notifyAllObservers() { // invoke notify AllObservers
         for (int i = 0; i < observerList.size(); i++) { // invoke Oberver update method for all Observers
            Observer o = observerList.get(i);
            o.update(state);
         }                                 // invoke Oberver update method for all Observers
   }
  
  /*           100% score
    private void notifyAllObservers() { // invoke notify AllObservers
         for (Observer o : observerList) { // invoke Oberver update method for all Observers
            o.update(state);
         }                                 // invoke Oberver update method for all Observers
   }
   */
}