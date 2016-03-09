import java.io.*;
/*
 * AZ_Challenge_2_main- Main method for Code Challenge 2 (Fizz Buzz)
 * Input: Path to file
 * Output: Fizz Buzz print statement
 * */


public class AZ_Challenge_2_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length!=0)
		{
			String filename=args[0]; //Get filename path
			String line=null; //Line of file
			//Try to read the file and catch exceptions
			try
			{
				FileReader fr=new FileReader(filename);
				BufferedReader br=new BufferedReader(fr);
				//Read each line and run is as a Consecutive number
				while ((line= br.readLine())!= null)
				{
					Fizz_Buzz fb=new Fizz_Buzz(line);
					fb.fizzbuzz();
					
				}
				br.close();
			}
			
			catch (FileNotFoundException e)
			{
				System.err.println("File not found:" + filename);  	
			}
			catch (IOException e)
			{
				System.err.println("Error Reading File:"+ filename);
			}
		}
		else
		{
			System.out.println("No file given!");
		}
	}

}
