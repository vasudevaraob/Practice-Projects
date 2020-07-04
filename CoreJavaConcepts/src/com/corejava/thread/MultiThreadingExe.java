package com.corejava.thread;

import java.util.Iterator;

class Exe1 extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("Am thread Exe1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

//extends Thread class 

class Multi extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	/*
	 * public static void main(String args[]) { Multi t1 = new Multi(); t1.start();
	 * }
	 */
}

//By implement Runnable interface
class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	/*
	 * public static void main(String args[]) { Multi3 m1 = new Multi3(); Thread t1
	 * = new Thread(m1); t1.start(); }
	 */
}

public class MultiThreadingExe {

	public static void main(String[] args) {

		Thread obj1 = new Thread();
		Exe1 obj = new Exe1();

		obj.start();
		Multi t1 = new Multi();
		t1.start();

		Runnable ob3 = () -> System.out.println("thread is running...");
	};

	// Multi3 m1 = new Multi3();
	Thread t2 = new Thread(() -> System.out.println("thread is running..."));
	// t2.start();

}
