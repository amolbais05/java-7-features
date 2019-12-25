package com.lynda.javatraining.characterstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (
				Scanner scanner = new  Scanner(new BufferedReader(new FileReader("tokenizedtext.txt")));
				
				) {
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
			System.out.println("All done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		
	}
}
