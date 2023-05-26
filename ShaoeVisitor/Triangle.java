//package beforevisitor;

public class Triangle implements Shape {
	public void accept(Visitor v) {
      v.visit(this);
	}
}
