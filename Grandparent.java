class Grandparent
{
//public static void main(String [] args);


 void print()
  { 
    System.out.println("Grandparent's print()");
  }
}


class Parent extends Grandparent

{ 
   void print()
  {
     super.print();
     System.out.println("parent's print()");
  }
}


 class Child extends Parent
{
    void print()
   
  {
    super.print();

  System.out.println("Child's print()");


   }
}

 class Main
{

 
  public static void main(String [] args)

   {
     Child c = new Child();

     c.print();
   }
}