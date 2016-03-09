import java.util.ArrayList;
import java.util.Arrays;
/*
 * AZ Challenge 1 Consecutive Numbers- Find consecutive numbers in a sequence
 * Input: A sequence
 * Output: Formatted ranges of consecutive numbers
 * Author: Sara Shaffer
 * */
public class Consecutive_Numbers {
	private ArrayList<String> seq_numbers; //The pre-processed numbers from the file
	private ArrayList<String> results; //Results after processing sequence
	
	public Consecutive_Numbers(String seq)
	{
		//Split the input sequence and add it to the seq_numbers array list
		this.seq_numbers=new ArrayList<String> (Arrays.asList(seq.split(" ")));
		
		//Initialize
		this.results=new ArrayList<String>();
	}
	
	
	/*
	 * printOutput
	 * Input: none
	 * Output: Formated ranges of consecutive numbers
	 * */
	private void printOutput()
	{
		//Cycle through results and print them out on one line
		for(int i=0; i<results.size(); i++)
		{
			System.out.print(results.get(i)+" ");
		}
		System.out.println();
	}
	
	/*
	 * getConecutives- Runs consecutive number search
	 * Input: none
	 * Output: Print out of consecutive values
	 * */
	public void getConsecutives()
	{
		ArrayList<Integer> values=new ArrayList<Integer>(); //List of consecutive values
		//Loop for each value in the sequence
		for (int i=0; i<(seq_numbers.size()-1); i++)
		{
			int curr_num=Integer.parseInt(seq_numbers.get(i)); //The current number
			int next_num=Integer.parseInt(seq_numbers.get(i+1)); //The next number in the sequence
			//Check if the next number in the sequence is consecutive to the current number
			if((curr_num+1)==next_num)
			{
				//If the list is empty, add the current value
				if(values.isEmpty())
				{
					values.add(curr_num);
				}
				values.add(next_num); //Add the next value
			}
			else
			{
				//Otherwise, the sequence has been proken
				//If the list has items in it
				if(!values.isEmpty())
				{
					//Format the first and last values
					String consec_seq=values.get(0)+"-"+values.get((values.size()-1));
					results.add(consec_seq);
					values= new ArrayList<Integer>(); //Clear list for next sequence
				}
			}
		}
		//Last values might get missed by loop
		//So if there is something in the list 
		if(!values.isEmpty())
		{
			//Format the first and last values
			String consec_seq=values.get(0)+"-"+values.get((values.size()-1));
			results.add(consec_seq);
			values= new ArrayList<Integer>(); //Clear list for next sequence
		}
		//Print out the results
		printOutput();
	}

}
