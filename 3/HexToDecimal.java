import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
 * HexToDecimal- Converts a hex value to a decimal (Code Challenge 3)
 * Input: Hex value
 * Output: Converted decimal
 * Author: Sara Shaffer
 * */
public class HexToDecimal {
	private String hex;
	
	public HexToDecimal(String hexadecimal)
	{
		hex=hexadecimal;
	}
	
	/**/
	private ArrayList<Integer> formatHexValues()
	{
		ArrayList<Integer> results= new ArrayList<Integer>();
		ArrayList<String> split_str= new ArrayList<String> (Arrays.asList(hex.split("")));
		//Go through and convert letters to numbers
		for (int i=0; i<split_str.size(); i++)
		{
			String curr_char=split_str.get(i);
			if (curr_char.equals("a"))
			{
				results.add(10);
			}
			else if (curr_char.equals("b"))
			{
				results.add(11);
			}
			else if (curr_char.equals("c"))
			{
				results.add(12);
			}
			else if (curr_char.equals("d"))
			{
				results.add(13);
			}
			else if (curr_char.equals("e"))
			{
				results.add(14);
			}
			else if (curr_char.equals("f"))
			{
				results.add(15);
			}
			else
			{
				//Be sure there are no empty characters coming through
				if(!curr_char.isEmpty())
				{
					results.add(Integer.parseInt(curr_char));
				}
			}
		}
		//Reverse the results list for conversion
		Collections.reverse(results);
		return results;
	}
	
	/*Convert hex to decimal*/
	public void convert()
	{
		ArrayList<Integer> hexValues=formatHexValues(); //Split the hex value, adjust the numbers, and reverse the list 
		int decimal=0; //init
		for(int power=0; power<hexValues.size(); power++)
		{
			//Get last digit of hex
			int curr_value=hexValues.get(power);
			//Multiply by 16^power
			curr_value*=(Math.pow(16, power));
			//Sum
			decimal+=curr_value;
			//Power is incremented in the loop
		}
		//Print out decimal
		System.out.println(decimal);
	}
}
