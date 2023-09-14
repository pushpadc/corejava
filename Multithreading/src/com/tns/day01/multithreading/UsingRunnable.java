package com.tns.day01.multithreading;

public class UsingRunnable implements Runnable{
	Thread t;
	int h, l;
	String msg;
	
	public UsingRunnable(int h,int l, String msg) {
		this.h=h;
		this.l=l;
		this.msg=msg;
		t=new Thread(this,"child Thread");
		t.start();
		
  }
    @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=h;i>1;i--) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("Error " + e.getMessage());	
			}
			System.out.println(msg + i);
		
		}
		
		
		
	}
	
	
}
