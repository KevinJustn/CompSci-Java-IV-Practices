class Visitor {                                 // Step 1 Create Visitor Class
   
   private Visitor () {}
  
   private static Visitor instance = null;      // Step 2 Make Visitor "Singleton"
                                                // Step 3 Add Visitor-Type Paraneter To classes [Circle, Square, Triangle]
                                                // Step 4 MiMr via Parameter with Leaving a Delegate
                                                // Step 5 Rename Methods to Visit and Accept
   public static Visitor getInstance() { 
      if (instance == null)
         instance = new Visitor(); 
      return instance;
   }
 
   public void visit(Square s) {
		System.out.println("draw() is Square");
	}
   public void visit(Circle c) {
		System.out.println("draw() in Circle");
	}
   public void visit(Triangle t) {
		System.out.println("draw() in Triangle");
	}
} 