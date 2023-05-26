class ASTVisitor { // Creating ASTVisitor class
   boolean visit(Stm node) { return true; } 
   boolean visit(CompoundStm node) { return true; } 
   boolean visit(AssignStm node) { return true; } 
   boolean visit(PrintStm node) { return true; }
   boolean visit(Exp node) { return true; } 
   boolean visit(IdExp node) { return true; } 
   boolean visit(NumExp node) { return true; } 
   boolean visit(OpExp node) { return true; } 
}
