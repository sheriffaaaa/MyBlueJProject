import java.util.Scanner ;

public class InputValues
{
    private int odd;
    private int even;
    
    public void inputValue()
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the odd number: " );
        this.odd = scanner.nextInt();
        System.out.print ("Enter the even number : ");
        this.even = scanner.nextInt();
    }
    
    public static void main (String[] args)
    {
        InputValues inputValues= new InputValues ();
        inputValues.inputValue();
        OddEven numbers = new OddEven(inputValues.odd, inputValues.even);
        System.out.println(numbers);
        System.out.println(numbers.oddEven());
    }  
}
