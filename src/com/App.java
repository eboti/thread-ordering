package com;

public class App {

	public static void main(String[] args) {
		Thread myThread1 = new Thread(new MyThread(), "thread1");
		Thread myThread2 = new Thread(new MyThread(), "thread2");
		Thread myThread3 = new Thread(new MyThread(), "thread3");
		
		Thread myThread4 = new Thread(new Runnable() {
			
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
		});
		
		try {
			myThread1.start();
			myThread1.join();

			myThread2.start();
			myThread2.join();

			myThread3.start();			
			myThread3.join();
			
			myThread4.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
