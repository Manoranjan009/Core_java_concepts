package com.cglia.training.exception;


class Count{
	int count;
	public synchronized void increment(){
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Count c = new Count();
		Thread t1 = new Thread ( new Runnable(){
			public void run() {
			for (int i=0;i<500;i++) {
				c.increment();
				}
			}
		}) ;
			
		Thread t2 = new Thread ( new Runnable(){
			public void run() {
			for (int i=0;i<1000;i++) {
				c.increment();
				}
			}
		}) ;
      
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		}

}

