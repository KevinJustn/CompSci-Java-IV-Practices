class PaintVisitor { 

   private PaintVisitor() {}
   
   private static PaintVisitor instance = null;
   
   public static PaintVisitor getInstance() { 
      if (instance == null) 
         instance = new PaintVisitor();
      return instance;
   }
   // MiMr for paint
   public void paint(Wheel w) {
		System.out.println("The wheel was painted in " + w.color);
   }
   public void paint(Body b) {
		System.out.println("The body part was painted in " + b.color);
	}
   public void paint(Engine e) {
		System.out.println("The engine was painted in " + e.color);
	}

}