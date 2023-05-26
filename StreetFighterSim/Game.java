public class Game { 
   Fighter f; 
   Game(Fighter f) { 
      this.f = f;
   }
   public void play(int h, int p, int d) { 
      f.kick(h);
      f.punch(p);
      f.roll(d);
   }
} 