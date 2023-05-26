public class Calculator { 
   Operation o;
   public Calculator(Operation o) {
      this.o = o;
   }
   
   public int solve(int x, int y) { 
      return o.calculate(x, y);
   }
} 