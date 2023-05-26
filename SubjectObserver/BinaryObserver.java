public class BinaryObserver extends Observer { 

   public BinaryObserver(Subject subject) { 
      super(subject);
   }
   
   public void update(int state) { 
       System.out.println("Binary State: " + Integer.toBinaryString(state));
   } 

}