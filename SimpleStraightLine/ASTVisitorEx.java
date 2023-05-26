class ASTVisitorEx extends ASTVisitor { // Creating ASTVisitorEx class
   boolean visit(NumExp node) { 
      System.out.println(node.num);
      return true;
   }
} 