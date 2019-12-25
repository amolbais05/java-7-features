package com.lynda.javatraining;

import java.io.IOException;

import com.lynda.javatraining.exceptions.WrongFileException;
import com.lynda.javatraining.util.MyFileReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String fileContent = MyFileReader.readFile("TextFile2.txt");
		System.out.println(fileContent);

		try {
			if (fileContent.equals("Right file")) {
				System.out.println("You chose the right file!");
			} else {
				throw (new WrongFileException());
			}
		} catch (WrongFileException e) {
			System.out.println(e.getMessage());
		}

	}
}
