// To run this program, run Main.java.

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape {
	protected DrawingPanel panel = null;
	protected Color c = Color.GREEN;
	protected int x1 = 50;
	protected int y1 = 150;
	protected int x2 = 200;
	protected int y2 = 50;
	
	public Line(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
