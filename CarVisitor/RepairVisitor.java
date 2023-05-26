class RepairVisitor { 
   
   private RepairVisitor() {}
   
   private static RepairVisitor instance = null; 
   
   public static RepairVisitor getInstance() { 
      if (instance == null) 
         instance = new RepairVisitor();
      return instance;
   }
   // MiMr for repair
   public void repair(Wheel w) {
		System.out.println("The wheel needs repairs since it cannot " + w.role);
	}
   public void repair(Body b) {
		System.out.println("The body part needs repairs since it cannot " + b.role);
	}
   public void repair(Engine e) {
		System.out.println("The engine needs repairs since it cannot " + e.role);
	}


}