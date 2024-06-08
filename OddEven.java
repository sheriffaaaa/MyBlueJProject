public class OddEven
{
    //data members
    private int Odd;
    private int Even;
    
    //normal constructor
    public OddEven ( int odd, int even )
    {
        this.Odd = odd;
        this.Even= even ;
    }
    
    //mutator
    public void setOdd (int odd) { this.Odd = odd;}
    public void setEven ( int even ) {this.Even = even;}
    
    //getter
    public int getOdd () {return this.Odd;}
    public int getEven () {return this.Even;}
    
    //processor 
    public String oddEven()
    {
      if ( this.Even % 2 == 0)
         return "Number is even";
      else 
        return "Number is odd";
      }
      
      // printer
    public String toString ()
    {
         return "Odd: " + this.Odd + ",Even: " + this.Even;
    }
}

    
   


