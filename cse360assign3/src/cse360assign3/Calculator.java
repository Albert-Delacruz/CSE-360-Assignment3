package cse360assign3;
/**
 * 
 * This class is a child class of AddingMachine class, having the same
 * methods as its parent, along with new methods multiply, divide,
 * and power and stores these operations as well
 * gitlink: https://github.com/Albert-Delacruz/CSE-360-Assignment3.git
 * 
 * ID: 1213265207
 * Assignment 3
 * @author aqwxc
 *
 */
public class Calculator extends AddingMachine{
	
	/**
	 * Constructor for Calculator class, uses addingMachine as parent
	 */
	public Calculator()
	{
		super();//constructs parent variables
	}
	
	/**
	 * Multiplies the input value with the currently stored total and
	 * adds the value to operations string
	 * @param value User inputed value for multiplying
	 */
	public void mult(int value)
	{
		operations += " * " + value;
		total = total * value;
	}
	
	/**
	 * Divides the current total with the input value, if the input is zero
	 * will set the total to zero. Stores operation and value in operations string
	 * @param value User inputed value for dividing
	 */
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
	
	/**
	 * Raises the current total by the input value, if the input value
	 * is negative, it sets the total to zero. Stores the operation and 
	 * the value into the operations string
	 * @param value
	 */
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
