package inheritance;

public class Gst extends IncomeTax {
	
	int calculateGst(int income) {
		int oldTax = super.calculateTax(income);
		int gst = income /20;
		return oldTax + gst;
	}

}
