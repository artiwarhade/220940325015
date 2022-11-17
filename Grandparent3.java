
class GrandParent3
{
   String grandFatherName;
   String grandMotherName;

   
   public GrandParent1(String grandFatherName, String grandMotherName)
   {
       this.grandFatherName=grandFatherName;
       this.grandMotherName=grandMotherName;

       System.out.println("Name of Grand Father is : "+grandFatherName);
       System.out.println("Name of Grand Mother is : "+grandMotherName);
   }
}


class Parent1 extends GrandParent1
{
   String FatherName;
   String MotherName;

   
   public Parent1(String FatherName,String MotherName,String grandFatherName, String grandMotherName)
   {
       super(grandFatherName, grandMotherName);
       this.FatherName=FatherName;
       this.MotherName=MotherName;

       System.out.println("Name of Father is : "+FatherName);
       System.out.println("Name of Mother is : "+MotherName);
   }

   
   public Parent1(String grandFatherName, String grandMotherName) {
       super(grandFatherName, grandMotherName);
   }
}

public class Child1 extends Parent1
   {
       public Child1(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
       super(FatherName, MotherName, grandFatherName, grandMotherName);
   }
   public static void main(String args[])
   {
       Child1 c = new Child1("Ayushi","Shubhangi","Ram","Neeta");
       