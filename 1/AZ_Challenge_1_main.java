import java.io.*;
/*
 * AZ_Challenge_1_main- Main method for Code Challenge 1 (Consecutive numbers)
 * Input: Path to file
 * Output: Consecutive Numbers print statement
 * Author: Sara Shaffer
 * */

public class AZ_Challenge_1_main {

	/**
	 * @param args- Filename path
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
					Consecutive_Numbers cn= new Consecutive_Numbers(line);
					cn.getConsecutives();
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
