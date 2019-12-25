package com.lynda.javatraining.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int iteration = 5;
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("From Runnable Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
