package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Mutual Exclusion:only one thread can access the critical section at a time.
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BankAccount bankAccount= new BankAccount();
		Runnable task= new Runnable() {
			@Override
			public void run() {
				bankAccount.withdraw(50);
			}
		};
		Thread t1= new Thread(task,"Thread 1");
		Thread t2= new Thread(task,"Thread 2");
		t1.start();
		t2.start();
//		Counter counter= new Counter();
//		MyThread t1=new MyThread(counter);
//		MyThread t2=new MyThread(counter);
//		t1.start();
//		t2.start();
//		try{
//			t1.join(); //so that both the instances first fet ended and then printed
//			t2.join();
//		}catch (Exception e){
//
//		}
//		System.out.println(counter.getCount());
	}

}
