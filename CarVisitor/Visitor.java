class Visitor { 

   private Visitor() {}
   
   private static Visitor instance = null;
   
   public static Visitor getInstance() { 
      if (instance == null) 
         instance = new Visitor();
      return instance;
   }
//Visitor v = new RepairVisitor();
//Visitor v = new PurchaseVisitor();
//Visitor v = new PaintVisitor();
   public void visit(Wheel w) { 
      System.out.println("The wheel was painted in " + w.color);
      System.out.println("The wheel was purchased in " + w.year);
      System.out.println("The wheel needs repairs since it cannot " + w.role);
   }
   public void visit(Body b) { 
      System.out.println("The body part was painted in " + b.color);
      System.out.println("The body part was purchased in " + b.year);
      System.out.println("The body part needs repairs since it cannot " + b.role);
   }
   public void visit(Engine e) { 
      System.out.println("The engine was painted in " + e.color);
      System.out.println("The engine was purchased in " + e.year);
      System.out.println("The engine needs repairs since it cannot " + e.role);
   }
}
   