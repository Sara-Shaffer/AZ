
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Fizz Buzz
 * Input: Factor numbers and N
 * Output: Fizz Buzz print statement
 * Author: Sara Shaffer
 * */
public class Fizz_Buzz {
	private ArrayList<String> results;
	private int N; //number of numbers to print
	private int fizz; //first factor
	private int buzz; //second factor
	
	public Fizz_Buzz(String line)
	{
		results=new ArrayList<String>();
		ArrayList<String> input =new ArrayList<String> (Arrays.asList(line.split(" ")));
		N=Integer.parseInt(input.get(input.size()-1)); //Get N- the last element of the Array List
		fizz=Integer.parseInt(input.get(0));//Get Fizz
		buzz=Integer.parseInt(input.get(1));//Get Buzz
	}
	
	/*Prints the output of the results list*/
	private void printOutput()
	{
		for(int i=0; i<results.size();i++)
		{
			//No trailing space at the end of the line
			if (i<(results.size()-1))
			{
				System.out.print(results.get(i)+" ");
			}
			else
			{
				//No trailing spaces per line
				System.out.println(results.get(i));
			}
		}
	}
	
	/*Fizz Buzz Function*/
	public void fizzbuzz()
	{
		//For 1-N
		for(int i=1; i<(N+1); i++)
		{
			//Check for Fizz Buzz using modulus
			if ((i%(fizz*buzz))==0)
			{
				results.add("FB");
			}
			//Check for Fizz
			else if ((i%fizz)==0)
			{
				results.add("F");
			}
			//Check for buzz
			else if ((i%buzz)==0)
			{
				results.add("B");
			}
			//Otherwise just add the number
			else
			{
				results.add(""+i);
			}
		}
		printOutput(); //print
	}

}
