
public class AttAsFinal
{
    final int x=10;
    
    public static void AttAsFinal (String []args)
    {
       AttAsFinal myObj = new AttAsFinal ();
       myObj.x = 25 ;//error will occur as it cant assign the x to a final variable
       System.out.println(myObj.x);
    }
}
