//package beforevisitor;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Square());
		list.add(new Triangle());
		
		for(Shape g : list) {
			g.accept(Visitor.getInstance());
		}		
	}
}
