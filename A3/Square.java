// To run this program, run Main.java.

import java.awt.Graphics;
import java.awt.Color;

public class Square implements Shape {
	protected DrawingPanel panel = null;
	protected Color c = Color.RED;
	protected int x = 20;
	protected int y = 10;
	protected int width = 100;
	protected int height = 50;
	
	public Square(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
