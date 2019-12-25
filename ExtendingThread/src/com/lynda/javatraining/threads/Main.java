package com.lynda.javatraining.threads;

public class Main {

	public static void main(String[] args) {
		int iteration = 3;
		
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("Output From Main Process");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
