//constructor parameter
public class Butterfly1
{
    int x;
    
    public Butterfly1 (int y)
    {
       x = y ; 
    }
   
    public static void Butterfly (String [] args)
    {
        Butterfly1 myObj = new Butterfly1 (8);
        System.out.println (myObj.x);
    }
}
