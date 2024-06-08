public class TheCozyCup
{
  private CoffeDrink [] coffeDrink;
  private Pastry [] pastry;
  
  //constructor
  public TheCozyCup ( CoffeDrink [] coffeDrink , Pastry [] pastry )
  {
      this.coffeDrink= coffeDrink;
      this.pastry= pastry;
  }
  
  //mutator
  public void setCoffeDrink( CoffeDrink [] coffeDrink ) {this.coffeDrink = coffeDrink;}
  public void setPastry ( Pastry [] pastry ) {this.pastry= pastry ;}
      
  //accessor 
  public CoffeDrink [] getCoffeDrink () {return this.coffeDrink;}
  public Pastry [] getPastry () {return this.pastry ;}
  
  
}

