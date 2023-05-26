public class Main { 
   public static void main(String args[]) { 
      Fighter[] fs = new Fighter[]{new Ryu(), new Ken(), new ChunLi()};
      for (Fighter f : fs)
         new Game(f).play(20,50,100);
   }
}