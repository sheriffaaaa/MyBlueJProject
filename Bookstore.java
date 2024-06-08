public class Bookstore
{
    //method to calculate total price including tax
    public double calculateTotalPrice (double pricePerBook,int quantity, double taxRate)
    {
       //calculate subtotal (price*quantity)
       double subtotal = pricePerBook * quantity;
       // calculate tax amount ( subtotal * taxRte / 100)
       double tax = subtotal * (taxRate /100);
       //Calculate totl price including tax ( subtotal + tax )
       double totalPrice = subtotal + tax ;
       return totalPrice;
    }
    
    public static void main (String [] args)
    {
        Bookstore store = new Bookstore ();
        //Calculate total price for ordering 5 books at $10 each with 8.5% tax
        double totalPrice = store.calculateTotalPrice (10.0, 5, 8.5);
        System.out.println ("Total Price : $ " +totalPrice);
    
    }
}
