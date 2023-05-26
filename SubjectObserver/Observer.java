public class Observer { 

   private Subject subject;


   public Observer(Subject subject) {     // no return type
      this.subject = subject;
      this.subject.attach(this);
   }
   
   public void update(int state) { 
      System.out.println(this + " new state: " + state);    // toString() is invoked on this
   }
   
   public void setState(int state) { 
      this.subject.setState(state);
   }
}