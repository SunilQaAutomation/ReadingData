package javaStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotePad {

	public static void main(String[] args) throws IOException {

			File file;
		// file outpust stream
		 file = new File(".\\files\\myNotepad.txt");
		FileWriter fw = new FileWriter(file, true); // here constructor is for file object, and to appened the file or
													// not and it is true or false
		BufferedWriter writter = new BufferedWriter(fw);

		// To write inside the file

			writter.write("First Line");
			writter.newLine();
			writter.write("Automation Live");
			writter.newLine();
			writter.write("432423432");
		writter.newLine();

		// using some program
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {

				int num = (int) (Math.random() * 100);
				writter.write(num + "\t");

			}
			writter.newLine();
		}

		writter.close();

		System.out.println("File Created !!!!");

//		// to read the data from the file

		System.out.println("Reading the data ------------");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);

				// To Read the first two lines
//		System.out.println(reader.readLine());
//		System.out.println(reader.readLine());
		
			
				// TO Read whole notepad
		String i="";
		 while((i=reader.readLine()) != null )
		 {
			 System.out.println(i);
		 }
		
		
		reader.close();

	}

}
