package FunctionalTests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class readingandwritingfiles {
	@Test
	public void writefile() throws IOException
	{
		//Create a new file
		File testfile = new File("C:\\Users\\Jenella\\AdvancedSelenium\\test.txt");	
		testfile.createNewFile();
		
		//write contents to file
		FileWriter writer = new FileWriter("C:\\Users\\Jenella\\AdvancedSelenium\\test.txt");
		
		BufferedWriter bufferwriter = new BufferedWriter(writer);
		bufferwriter.write("Line 1: This is some text for my new file");
		bufferwriter.newLine();
		bufferwriter.write("Line 2: This is even more text for my new file");
		bufferwriter.newLine();
		bufferwriter.write("Line 3: I love this class, I learn so much");
		bufferwriter.flush();
		
		//Reading contents of a file
		
		FileReader reader = new FileReader("C:\\Users\\Jenella\\AdvancedSelenium\\test.txt");
		BufferedReader bufferreader = new BufferedReader(reader);
		
		/*long readcount = bufferreader.lines().count();
		System.out.println(readcount);
		
		for(long i=0;i<readcount;i++);
		{
		System.out.println("Line 1: " +bufferreader.readLine());
		}
		*/
		String s;
		
		while((s=bufferreader.readLine())!=null)
		{
			System.out.println(s);
		}
	}
	

}
