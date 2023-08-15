package co.edureka.java.threads;

import java.util.concurrent.TimeUnit;

class Printer{
	synchronized public void printTable(int num) {
		for(int i=1; i<=5; i++) {
			int p = num * i;
			System.out.println(String.format("%-2d x  %-2d = %3d", num, i, p));
			try {
				TimeUnit.SECONDS.sleep(1); //Thread.sleep(1000);
			}catch(Exception ex) {}
		}//for
		System.out.println("---------------------------------------------------------------------------");
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(Exception ex) {}		
	}
}

class ComputerThread1 extends Thread{
	Printer printer;
	int num;
	
	public ComputerThread1(Printer printer, int num) {
		super();
		this.printer = printer;
		this.num = num;
	}
	
	public void run() {
		printer.printTable(num);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;
	int num;
	
	public ComputerThread2(Printer printer, int num) {
		super();
		this.printer = printer;
		this.num = num;
	}
	
	public void run() {
		printer.printTable(num);
	}
}

public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Thread t1 = new ComputerThread1(printer, 7);
		Thread t2 = new ComputerThread2(printer, 8);
		
		t1.start();
		t2.start();
	}
}