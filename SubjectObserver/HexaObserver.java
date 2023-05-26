public class HexaObserver extends Observer{ 

   public HexaObserver(Subject subject) { 
      super(subject);
   }
   
   public void update(int state) { 
       System.out.println("Hexa state: " + Integer.toHexString(state));
   } 

}