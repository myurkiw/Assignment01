package cse360assignment02;

public class AddingMachine 
{
  private int total;
  private StringBuffer opps;
  
  public AddingMachine () //constructor
  {
	  total = 0;  // not needed - included for clarity
	  opps = new StringBuffer("0");
  }
  
  public int getTotal () //returns the variable total
  {
	  return total;
  }
  
  public void add (int value) //adds parameter value to total
  {
	  total = total + value;
	  opps.append("+" + value);
  	
  }

  public void subtract (int value) //subtracts parameter value from total
  {
	  total = total - value;
	  opps.append("-" + value);
  }

  public String toString () //returns operations done to total
  {
	  return opps.toString();
  }

  public void clear() //clears memory
  {
	  System.gc();  
  }
}