package notePad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingDataFromNotePad {

	public static void main(String[] args) throws IOException {

		// creating object of the file
		File file = new File("C:\\Selenium_WorkSpace\\ReadingData\\files\\notepad.txt");

				// file is creating
		file.createNewFile();
		System.out.println("file is created");

									// Writing inside a file
		FileWriter fw = new FileWriter("C:\\Selenium_WorkSpace\\ReadingData\\files\\notepad.txt",true);
		BufferedWriter buffWriter = new BufferedWriter(fw);

		buffWriter.write("This is the first statement of the notepad");
		buffWriter.newLine();
		buffWriter.write("125");
		buffWriter.write(" This is seocnd line");
		buffWriter.close();
		System.out.println("----------");

		// To read the data from the file
		
		FileReader fr = new FileReader("C:\\Selenium_WorkSpace\\ReadingData\\files\\notepad.txt");
		BufferedReader buffReader = new BufferedReader(fr);
		System.out.println(buffReader.readLine()); // to the fisrt a sinlge line
		System.out.println(buffReader.readLine()); // to the second a sinlge line
		System.out.println("----------");

		// to read whole notepad
		String i = "";
		while ((i = buffReader.readLine()) != null) {

			System.out.println(i);
		}
		
		buffReader.close();

	}

}
