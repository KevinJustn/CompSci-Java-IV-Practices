public class SubjectForOnlyNewState extends Subject { 

   public void setState(int state) { 
      if (super.state != state) {
         super.setState(state);
      }
   }

} 