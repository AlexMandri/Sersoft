package sersoft;

public class PrinterClass {
	private String arg;
	public PrinterClass() { System.out.println("no args");}
	public PrinterClass(String arg) {
		super();
		this.arg = arg;
		System.out.println("arg");
	}
	public void print() {
		System.out.println(arg);
	}
	
	
}
