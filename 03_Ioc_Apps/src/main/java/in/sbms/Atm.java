package in.sbms;

import in.sbms.print.Printer;

public class Atm {
	
	private Printer printer;
	
	public Atm() {
	System.out.println("This Atm Machine ...Function");
	}
	
	public Atm(Printer printer) {
		System.out.println("Atm () Constructor........😁😂😃");
		this.printer = printer;
		printer.print();
	}
	
	public void setPrinter(Printer printer) {
		System.out.println("setPrinter()........😁😂😃");
		this.printer = printer;
		printer.print();
	}
	
	public void withdrow(int amt) {
		System.out.println("Atm Deducated Amounsts 3444...........💼💼💼💼");
		printer.print();
	}

}
