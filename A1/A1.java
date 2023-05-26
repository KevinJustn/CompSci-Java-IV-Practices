// This program prints ASCII art representations. The art will chage based on the variable input for SIZE.

public class A1 {
    
    // Change this value to change the ASCII Art
    public static int SIZE = 3;

    public static void main(String[] args) {
        if(args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);

        TowerPeak();
        TowerBody();
        TowerBase();
    }
    
   public static void TowerPeak() { // The top portion of the ASCII art.
      AtCharacters();
      for (int VerticalBarLines = 0; VerticalBarLines < ((3*SIZE) - 1); VerticalBarLines++) { 
         VerticalBarCharacters();
      }
      AtCharacters();
   }
    
   public static void TowerBody() { // The middle portion of the ASCII art.
      int SizeMin1 = SIZE - 1;
      TildeCharacters();
      for (int HashDashLines = 0; HashDashLines < ((SIZE*SizeMin1) + (SizeMin1 - 2)); HashDashLines++) { 
         HashDashCharacters();
         TildeCharacters();
      }
   }
   
   public static void TowerBase() { // The bottom portion of the ASCII art.
      for (int QALines = 0; QALines < SIZE; QALines++) { 
         QuoteAmpersandCharacters();
      }
   }
    
   public static void LongDottedLine() { // The dotted line for the @ and | characters based on SIZE.
      for (int Ldots = 0; Ldots < ((5*SIZE) - (SIZE - 2)); Ldots++) { 
         System.out.print(".");
      }
   }
    
   public static void ShortDottedLine() { // The dotted line for the ~ and #- characters based on SIZE.
      for (int Sdots = 0; Sdots < (4*SIZE); Sdots++) { 
         System.out.print(".");
      }
   }
    
   public static void AtCharacters() { // The designated amount of @ characters based on SIZE.
      LongDottedLine();
      for (int Ats = 0; Ats < (2*SIZE-1); Ats++) { 
         System.out.print("@");
      }
      LongDottedLine();
      System.out.println();
   }
    
   public static void VerticalBarCharacters() {  // The designated amount of | characters based on SIZE.
      LongDottedLine();
      for (int VBars = 0; VBars < (2*SIZE-1); VBars++) { 
         System.out.print("|");
      }
      LongDottedLine();
      System.out.println();
   }
    
   public static void TildeCharacters() {  // The designated amount of ~ characters based on SIZE.
      ShortDottedLine();
      for (int til = 0; til < ((3*SIZE) + (3 - SIZE)); til++) { 
         System.out.print("~");
      }
      ShortDottedLine();
      System.out.println();
   }
    
   public static void HashDashCharacters() { // The designated amount of #- characters based on SIZE.
      ShortDottedLine();
      System.out.print("|-");
      for (int HD = 0; HD < SIZE; HD++) { 
         System.out.print("#-");
      }
      System.out.print("|");
      ShortDottedLine();
      System.out.println();
   }
    
   public static void QuoteAmpersandCharacters() { // The designated amount of &" characters based on SIZE.
      System.out.print("/\"");
      for (int QA = 0; QA < (5*SIZE); QA++) { 
         System.out.print("&\"");
      }
      System.out.print("\\");
      System.out.println();
   }
    
    //
    //---------------------------------------------------------------------
}
