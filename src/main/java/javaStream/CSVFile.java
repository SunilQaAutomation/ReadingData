package javaStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFile {

	public static void main(String[] args) throws IOException {

		File file = new File(".\\files\\mycsvfile.csv");
		// To write the data
		FileWriter fw = new FileWriter(file, false); // here constructor is for file object, and to appened the file or
		// not and it is true or false
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("first line");
		writer.newLine();
		writer.write("automation live");
		writer.newLine();
		writer.write("sample form");
		writer.newLine();

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 9; j++) {

				int num = (int) (Math.random() * 100);
				writer.write(num + ",");

			}
			writer.newLine();
		}

		writer.close();
		System.out.println("CSV FILE IS CREATED.!!!!!!");
		System.out.println("READING THE DATA ---------------------------");

		// To read the data
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);

		System.out.println(reader.readLine());
		System.out.println(reader.readLine());

		// To read whole csv file
		String i = "";

		while ((i = reader.readLine()) != null) {
			System.out.println(i);
			
		}
			reader.close();
	}

}
