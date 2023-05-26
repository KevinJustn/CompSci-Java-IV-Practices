class PurchaseVisitor { 

   private PurchaseVisitor() {}
   
   private static PurchaseVisitor instance = null;
   
   public static PurchaseVisitor getInstance() { 
      if (instance == null) 
         instance = new PurchaseVisitor();
      return instance;
   }
   // MiMr for purchase
    public void accept(Visitor v) {
		v.visit(this);
   }
   public void purchase(Body b) {
		System.out.println("The body part was purchased in " + b.year);
	}
   public void purchase(Engine e) {
		System.out.println("The engine was purchased in " + e.year);
	}
   /*
   public void purchase(Wheel w) {
		System.out.println("The wheel was purchased in " + w.year);
   }
   public void purchase(Body b) {
		System.out.println("The body part was purchased in " + b.year);
	}
   public void purchase(Engine e) {
		System.out.println("The engine was purchased in " + e.year);
	}*/

}