public class Person
{
   // fields
   private String name;
   private String email;
   private String phoneNumber;
   
   

   public Person()
   {
	  System.out.println("Please add field details");
   }

   // constructor
   public Person(String theName)
   {
	  this(theName+"@edu.in","406 558-7725");
      this.name = theName;
      
   }
   
  
   public Person(String theEmail,String thePhoneNumber)
   {
      this.email = theEmail;
      this.phoneNumber=thePhoneNumber;
   }
   
   public Person(String theName,String theEmail,String thePhoneNumber)
   {
	  this.name = theName;
      this.email = theEmail;
      this.phoneNumber=thePhoneNumber;
   }
   

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
      Person p1 = new Person("Sana");
      System.out.println(p1);
      
      Person p2 = new Person("Jean");
      p2.setEmail("jean@gmail.com");
      p2.setPhoneNumber("404 899-9955");
      System.out.println(p2);
      
      Person p3=new Person("Rakesh","chaudhary1rakesh78440@gmail.com","7906168517");
      System.out.println(p3);
   }
}
