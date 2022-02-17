package day9;

class bike extends Thread {
	public void run() {
	System.out.println("the thread id no. for the bike class is: " + Thread.currentThread().getId());
	}
}

class cycles extends Thread {
	public void run() {
		
	
	System.out.println("the thread id no. for the cycles class is: " + Thread.currentThread().getId());
}
}

class scooter extends Thread {
	public void run() {
	System.out.println("the thread id no. for the scooter class is: " + Thread.currentThread().getId());
	}
}
public class MultiThreading implements Runnable {
	public void run() {
		System.out.println("the thread id no. for the MULTITHREADING class is: " + Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cycles c = new cycles();
		c.setPriority(Thread.MAX_PRIORITY);
		c.start();
		scooter s = new scooter();
		s.start();
	for(int i=0;i<5;i++) {
		bike b = new bike();
		b.setPriority(Thread.NORM_PRIORITY);
		b.start();
		}
		MultiThreading m = new MultiThreading();
		Thread t = new Thread(m);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Id no. for main is: "+ Thread.currentThread().getId());
		t.start();
	}

}
