public class Main { 
   public static void main(String[] args) { 
      Subject subject = new SubjectForOnlyNewState();
      
      Observer x = new DecimalObserver(subject);
      Observer y = new BinaryObserver(subject);
      Observer z = new HexaObserver(subject);
      
      x.setState(10);
      x.setState(11);
      
   }
}