abstract class Stm {
	abstract void accept(ASTVisitor v);      // Introducing Visitor
}

class CompoundStm extends Stm {
	Stm stm1, stm2;

	CompoundStm(Stm s1, Stm s2) {
		stm1 = s1;
		stm2 = s2;
	} 
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);          //invoke itself
      stm1.accept(v);         //invoke itself
      stm2.accept(v);         //invoke itself
   }
}

class AssignStm extends Stm {
	String id;
	Exp exp;

	AssignStm(String i, Exp e) {
		id = i;
		exp = e;
	} 
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);          //invoke itself
      exp.accept(v);          //invoke itself
   }
   
}

class PrintStm extends Stm {
	Exp exp;

	PrintStm(Exp e) {
		exp = e;
	}	 
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);          //invoke itself
      exp.accept(v);          //invoke itself
   }
   
}

abstract class Exp {
   abstract void accept(ASTVisitor v);      //Introducing Visitor
}

class IdExp extends Exp {
	String id;

	IdExp(String i) {
		id = i;
	}	 
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);          //invoke itself
      
   }
}  

class NumExp extends Exp {
	int num;

	NumExp(int n) {
		num = n;
	}
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);          //invoke itself
   }
   
}

class OpExp extends Exp {
	Exp left, right;
	int oper;
	final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	} 
   
   void accept(ASTVisitor v) { // Introducing Visitor
      v.visit(this);           //invoke itself
      left.accept(v);          //invoke itself
      right.accept(v);         //invoke itself
   }

}
