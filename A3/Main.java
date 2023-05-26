// This program prints three figures in another window: 
// A square, a circle, and a line.

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300, 200);

		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Circle(panel));
		list.add(new Line(panel));
		list.add(new Square(panel));
		
		for(Shape g : list) {
			g.accept(Visitor.getInstance());
		}		
	}
}
