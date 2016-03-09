import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * AZ_Challenge_3_main- Main method for Code Challenge 3 (Hex to decimal)
 * Input: Path to file
 * Output: Converted decimal
 * Author: Sara Shaffer
 * */


public class AZ_Challenge_3_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=0)
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
					HexToDecimal htd=new HexToDecimal(line);
					htd.convert();
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
