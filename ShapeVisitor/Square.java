//package beforevisitor;

public class Square implements Shape {
	public void accept(Visitor v) {
      v.visit(this);
	}
}
