package com.lynda.javatraining.filetree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult postVisitDirectory(Path arg0, IOException arg1) throws IOException {
		System.out.println("Just Visited : "+arg0);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path arg0, BasicFileAttributes arg1) throws IOException {
		System.out.println("About To Visit : "+arg0);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path arg0, BasicFileAttributes arg1) throws IOException {
		if(arg1.isRegularFile()) {
			System.out.print("Regular File : ");
		}
		System.out.println(arg0);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path arg0, IOException arg1) throws IOException {
		System.out.println(arg1.getMessage());
		return FileVisitResult.CONTINUE;
	}

}
