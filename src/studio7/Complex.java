package studio7;

public class Complex {

	private double a;
	private double b;
	
	public Complex(double aa, double bb) {
		a = aa;
		b = bb;
	}
	
	public String Add(double one, double two) {
		double numA = a + one;
		double numB = b + two;
		String combined = numA + " + " + numB + "i";
		return combined;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex A = new Complex(2,3);
		System.out.print(A.Add(4,5));
	}

}
