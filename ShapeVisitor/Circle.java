//package beforevisitor;

public class Circle implements Shape {	
	public void accept(Visitor v) {
      v.visit(this);
	}
}
