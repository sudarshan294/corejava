package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample1 {
	public static void main(String[] args) {
		
		File file = new File("C:\\files"); 		
		String content = "this is  a text file";
		FileWriter fw = null;
		try
		{
			 fw = new FileWriter(file+"/testt.txt");
			fw.write(content);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fw.close();
			}
			catch (IOException e) 
			{
			
				e.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
