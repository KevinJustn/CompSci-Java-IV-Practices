import java.util.Hashtable;
public class Main {
   
   static Hashtable<String,Integer> // Creating Hashtables
      st = new Hashtable<String,Integer>();

	public static void main(String args[]) {
		 Prog.prog.accept(new ASTVisitorEx()); // Creating ASTVisitor Class -> Creating ASTVisitorEx Class
	}
}
