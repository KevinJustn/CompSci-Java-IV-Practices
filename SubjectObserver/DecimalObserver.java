public class DecimalObserver extends Observer{ 
   
   public DecimalObserver(Subject subject) { 
      super(subject);
   }
   
   public void update(int state) { 
       System.out.println("Decimal State: " + state);
   } 

}