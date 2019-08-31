package com.quinnox.threading;

class MultithreadingDemo extends Thread{
	public void run(){
		try{
			//for(int i=0;i<2;i++)
			System.out.println("Thread"+Thread.currentThread().getId()+" is Running");
		}
		catch(Exception e){
			System.out.println("Exception is cought");
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<n;i++){
			//System.out.println("Main Thread"+Thread.currentThread().getId()+" is Running");
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}

}
