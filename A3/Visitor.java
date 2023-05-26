// To run this program, run Main.java.

 // import statements
import java.awt.Graphics;

public class Visitor {
	//---------------------------------------------------------------------
	// Fill in your code here
   private Visitor() {}
   
   private static Visitor instance = null; 
   
   public static Visitor getInstance() { 
      if (instance == null)
         instance = new Visitor();
      return instance;
   }
   
   public void visit(Line L) {
		Graphics g = L.panel.getGraphics();
		g.setColor(L.c);
		g.drawLine(L.x1, L.y1, L.x2, L.y2);
	}

	public void visit(Circle C) {
		Graphics g = C.panel.getGraphics();
		g.setColor(C.c);
		g.fillOval(C.x, C.y, C.width, C.height);
	}
 
   public void visit(Square S) {
		Graphics g = S.panel.getGraphics();
		g.setColor(S.c);
		g.fillRect(S.x, S.y, S.width, S.height);
	}
   
	//
	//---------------------------------------------------------------------	
}
