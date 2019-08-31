package com.quinnox.threading;

public class MyThread extends Thread{
	public static void main(String[] args){
		MyThread objex=new MyThread();
		objex.create();
		System.out.println("this is the main method");
	}
	public void create(){
		Thread objth=new Thread(this);
		objth.start();
	}
	public void run(){
		while(true){
			try{
				System.out.println("This isthe child Thread");
				Thread.sleep(500);
			}
			catch(InterruptedException e){
		}
	}
	}
}
