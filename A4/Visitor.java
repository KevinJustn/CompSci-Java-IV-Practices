// To run this program, run Main.java.

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
   
   public void visit(CompoundStm C) { // First
      C.stm1.accept(Visitor.getInstance());
		System.out.print(" ; ");
		C.stm2.accept(Visitor.getInstance());

   }
   
   public void visit(AssignStm A) { // Second
      System.out.print(A.id);
		System.out.print(" := ");
		A.exp.accept(Visitor.getInstance());

   }
   
   public void visit(PrintStm P) {  // Third
		System.out.print("print( ");
		P.exps.accept(Visitor.getInstance());	
		System.out.print(" )");		
	}
   
   public void visit(IdExp I) {  // Fourth
		System.out.print(I.id);	
	}
   
   public void visit(NumExp E) {  // Fifth
		System.out.print(E.num);	
	}

   public void visit(OpExp O) {    // Sixth
		O.left.accept(Visitor.getInstance());	
		System.out.print(" ");
		switch(O.oper) {
		case OpExp.Plus:           // interesting cases
			System.out.print("+");
			break;
		case OpExp.Minus:
			System.out.print("-");
			break;
		case OpExp.Times:
			System.out.print("*");
			break;
		case OpExp.Div:
			System.out.print("/");
			break;
		}
		System.out.print(" ");
		O.right.accept(Visitor.getInstance());
	}
   
   public void visit(EseqExp E) {		// Seventh
		System.out.print("( ");
		E.stm.accept(Visitor.getInstance());
		System.out.print(" , ");
		E.exp.accept(Visitor.getInstance());
		System.out.print(" )");
	}
   
   public void visit(PairExpList PE) {    // Eight
		PE.head.accept(Visitor.getInstance());		
		System.out.print(" , ");
		PE.tail.accept(Visitor.getInstance());
	}
   
   public void visit(LastExpList LE) {    // Ninth
		LE.head.accept(Visitor.getInstance());	
	}


	
	//
	//---------------------------------------------------------------------	
}
