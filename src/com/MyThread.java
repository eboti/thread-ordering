package com;

public class MyThread implements Runnable {


	@Override
	public void run() {
		
		try {			
			System.out.println(Thread.currentThread().getName() + " started");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
