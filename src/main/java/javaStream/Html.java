package javaStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Html {

	public static void main(String[] args) throws IOException {
		
		File file = new File(".\\files\\MyHtml.html");
		
		FileWriter fw = new FileWriter(file,false);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("<html><body><title>SeleniumPractise</title><h1>Learn Selenium</h1></body> </html>");
		writer.close();
		
		System.out.println("READING THE DATA -------------");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		System.out.println(reader.readLine());
		reader.close();
		
		
		

	}

}
