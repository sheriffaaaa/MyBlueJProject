//create Constructor class
 public class Butterfly
{
  int x; //create class attributes
  
  //create a class constructor for the Butterfly class
  public Butterfly ()
  {
      x=10;// set the initial value for the class attributes x
  }
  
  public static void Butterfly (String [] args)
  {
      Butterfly myObj = new Butterfly ();//create an object of class Buttrfly [ known as constructor]
      System.out.println (myObj.x);//print value of x
  }

  //output 10 
}
    


