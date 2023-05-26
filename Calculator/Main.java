public class Main { 
   public static void main(String[] args) { 
      Calculator calc = new Calculator(new Addition()); // change Operation types to Strategies
      System.out.println("10 + 5 = " + calc.solve(10, 5));
      
      calc = new Calculator(new Subtraction());
      System.out.println("10 - 5 = " + calc.solve(10, 5));
      
      calc = new Calculator(new Multiplication());
      System.out.println("10 * 5 = " + calc.solve(10, 5));
      
      calc = new Calculator(new Division());
      System.out.println("10 / 5 = " + calc.solve(10, 5));
   }
}