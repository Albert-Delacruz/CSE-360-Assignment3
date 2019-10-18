package cse360assign3;
/**
 * 
 * This class is a child class of AddingMachine class, having the same
 * methods as its parent, along with new methods multiply, divide,
 * and power and stores these operations as well
 * 
 * ID: 1213265207
 * Assignment 3
 * @author aqwxc
 *
 */
public class Calculator extends AddingMachine{
	
	public Calculator()
	{
		super();//constructs parent variables
	}
	
	public void mult(int value)
	{
		operations += " * " + value;
		total = total * value;
	}
	
	public void div(int value)
	{
		operations += " / " + value;
		if(value == 0)//checks if dividing by zero
		{
			total = 0;//sets total to zero instead of divide by zero error
		}
		else
		{
			total = total/value;
		}
	}
	
	public void power(int value)
	{
		operations += " ^ " + value;
		if(value < 0)//checks if the value is negative
		{
			total = 0;
		}
		else
		{
			total = (int)Math.round(Math.pow(total,value));//raises total by the value, total^value
		}
	}
}
